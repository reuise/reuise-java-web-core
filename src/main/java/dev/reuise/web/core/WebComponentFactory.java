package dev.reuise.web.core;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.RootComponent;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.accordion.CoreAccordionOptions;
import dev.reuise.core.applayout.CoreAppLayoutBodyOptions;
import dev.reuise.core.applayout.CoreAppLayoutOptions;
import dev.reuise.core.avatar.CoreAvatarOptions;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.banner.CoreBannerOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.core.button.CoreButtonBarOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.card.CoreCardGridOptions;
import dev.reuise.core.card.CoreCardOptions;
import dev.reuise.core.carousel.CoreCarouselCardOptions;
import dev.reuise.core.carousel.CoreCarouselOptions;
import dev.reuise.core.chat.CoreChatBoxOptions;
import dev.reuise.core.checkbox.CoreBasicCheckboxOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.core.chip.CoreFilterChipOptions;
import dev.reuise.core.consent.CoreConsentBannerOptions;
import dev.reuise.core.currencyselector.CoreCurrencySelectorOptions;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.dialog.CoreMessageDialogOptions;
import dev.reuise.core.divider.CoreDividerOptions;
import dev.reuise.core.drawer.CoreDrawerOptions;
import dev.reuise.core.dropzone.CoreDropZoneOptions;
import dev.reuise.core.floating.CoreFloatingActionButtonOptions;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.input.CoreChipFieldOptions;
import dev.reuise.core.input.CoreMultiEmailAddressFieldOptions;
import dev.reuise.core.input.CorePasswordFieldOptions;
import dev.reuise.core.input.CoreSearchFieldOptions;
import dev.reuise.core.input.CoreSegmentedTextFieldOptions;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.core.layout.CoreColumnLayoutOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.CoreRowLayoutOptions;
import dev.reuise.core.layout.CoreSheetLayoutOptions;
import dev.reuise.core.layout.CoreSurfaceOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.link.CoreNavigationLinkOptions;
import dev.reuise.core.list.CoreBasicListItemOptions;
import dev.reuise.core.list.CoreBasicListOptions;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.core.media.CoreAudioPlayerOptions;
import dev.reuise.core.media.CoreMediaPlayerOptions;
import dev.reuise.core.media.CoreTextTrackOptions;
import dev.reuise.core.media.CoreVideoPlayerOptions;
import dev.reuise.core.menu.CoreMenuButtonItemOptions;
import dev.reuise.core.menu.CoreMenuButtonOptions;
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.navigation.CoreNavigationTreeGroupOptions;
import dev.reuise.core.navigation.CoreNavigationTreeLinkOptions;
import dev.reuise.core.navigation.CoreNavigationTreeOptions;
import dev.reuise.core.overflow.CoreOverflowBarOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.progressindicator.CoreProgressIndicatorOptions;
import dev.reuise.core.regionselector.CoreRegionSelectorOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgeOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgeOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions;
import dev.reuise.core.table.CoreCheckboxTableCellOptions;
import dev.reuise.core.table.CoreCheckboxTableColumnOptions;
import dev.reuise.core.table.CoreTableBodyOptions;
import dev.reuise.core.table.CoreTableCellOptions;
import dev.reuise.core.table.CoreTableColumnGroupOptions;
import dev.reuise.core.table.CoreTableColumnOptions;
import dev.reuise.core.table.CoreTableFooterOptions;
import dev.reuise.core.table.CoreTableHeaderCellOptions;
import dev.reuise.core.table.CoreTableHeaderOptions;
import dev.reuise.core.table.CoreTableHeaderRowOptions;
import dev.reuise.core.table.CoreTableOptions;
import dev.reuise.core.table.CoreTableRowOptions;
import dev.reuise.core.tabs.CoreTabBarOptions;
import dev.reuise.core.tabs.CoreTabOptions;
import dev.reuise.core.text.CoreHeadingOptions;
import dev.reuise.core.text.CoreIconLabelOptions;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabelOptions;
import dev.reuise.core.text.CoreLineBreakOptions;
import dev.reuise.core.text.CoreParagraphOptions;
import dev.reuise.core.text.CoreRotatingTextOptions;
import dev.reuise.core.text.CoreTextBlockOptions;
import dev.reuise.core.text.CoreTextOptions;
import dev.reuise.core.topappbar.CoreTopAppBarOptions;
import dev.reuise.core.view.CoreSheetViewOptions;
import dev.reuise.core.view.CoreViewOptions;
import dev.reuise.web.core.accordion.WebAccordion;
import dev.reuise.web.core.accordion.WebAccordionItem;
import dev.reuise.web.core.accordion.WebAccordionItemOptions;
import dev.reuise.web.core.accordion.WebAccordionOptions;
import dev.reuise.web.core.applayout.WebAppLayout;
import dev.reuise.web.core.applayout.WebAppLayoutBody;
import dev.reuise.web.core.applayout.WebAppLayoutBodyOptions;
import dev.reuise.web.core.applayout.WebAppLayoutOptions;
import dev.reuise.web.core.avatar.WebAvatar;
import dev.reuise.web.core.avatar.WebAvatarOptions;
import dev.reuise.web.core.badge.WebBadge;
import dev.reuise.web.core.badge.WebBadgeOptions;
import dev.reuise.web.core.banner.WebBanner;
import dev.reuise.web.core.banner.WebBannerOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.bottomappbar.WebBottomAppBar;
import dev.reuise.web.core.bottomappbar.WebBottomAppBarOptions;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.button.WebButtonBar;
import dev.reuise.web.core.button.WebButtonBarOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.button.WebIconButton;
import dev.reuise.web.core.button.WebIconButtonOptions;
import dev.reuise.web.core.card.WebCard;
import dev.reuise.web.core.card.WebCardGrid;
import dev.reuise.web.core.card.WebCardGridOptions;
import dev.reuise.web.core.card.WebCardOptions;
import dev.reuise.web.core.carousel.WebCarousel;
import dev.reuise.web.core.carousel.WebCarouselCard;
import dev.reuise.web.core.carousel.WebCarouselCardOptions;
import dev.reuise.web.core.carousel.WebCarouselOptions;
import dev.reuise.web.core.chat.WebChatBox;
import dev.reuise.web.core.chat.WebChatBoxOptions;
import dev.reuise.web.core.checkbox.WebBasicCheckbox;
import dev.reuise.web.core.checkbox.WebBasicCheckboxOptions;
import dev.reuise.web.core.checkbox.WebCheckbox;
import dev.reuise.web.core.checkbox.WebCheckboxOptions;
import dev.reuise.web.core.chip.WebChip;
import dev.reuise.web.core.chip.WebChipGroup;
import dev.reuise.web.core.chip.WebChipGroupOptions;
import dev.reuise.web.core.chip.WebChipOptions;
import dev.reuise.web.core.chip.WebFilterChip;
import dev.reuise.web.core.chip.WebFilterChipOptions;
import dev.reuise.web.core.consent.WebConsentBanner;
import dev.reuise.web.core.consent.WebConsentBannerOptions;
import dev.reuise.web.core.currencyselector.WebCurrencySelector;
import dev.reuise.web.core.currencyselector.WebCurrencySelectorOptions;
import dev.reuise.web.core.dialog.WebDialog;
import dev.reuise.web.core.dialog.WebDialogOptions;
import dev.reuise.web.core.dialog.WebMessageDialog;
import dev.reuise.web.core.dialog.WebMessageDialogOptions;
import dev.reuise.web.core.divider.WebDivider;
import dev.reuise.web.core.divider.WebDividerOptions;
import dev.reuise.web.core.document.WebDocument;
import dev.reuise.web.core.document.WebDocumentBody;
import dev.reuise.web.core.document.WebDocumentBodyOptions;
import dev.reuise.web.core.document.WebDocumentOptions;
import dev.reuise.web.core.drawer.WebDrawer;
import dev.reuise.web.core.drawer.WebDrawerOptions;
import dev.reuise.web.core.dropzone.WebDropZone;
import dev.reuise.web.core.dropzone.WebDropZoneOptions;
import dev.reuise.web.core.filepicker.WebFilePicker;
import dev.reuise.web.core.filepicker.WebFilePickerOptions;
import dev.reuise.web.core.floating.WebFloatingActionButton;
import dev.reuise.web.core.floating.WebFloatingActionButtonOptions;
import dev.reuise.web.core.floating.WebFloatingPanel;
import dev.reuise.web.core.floating.WebFloatingPanelOptions;
import dev.reuise.web.core.graphics.svg.WebSvg;
import dev.reuise.web.core.graphics.svg.WebSvgGroup;
import dev.reuise.web.core.graphics.svg.WebSvgGroupOptions;
import dev.reuise.web.core.graphics.svg.WebSvgImage;
import dev.reuise.web.core.graphics.svg.WebSvgImageOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.graphics.svg.WebSvgPath;
import dev.reuise.web.core.graphics.svg.WebSvgPathOptions;
import dev.reuise.web.core.graphics.svg.WebSvgRect;
import dev.reuise.web.core.graphics.svg.WebSvgRectOptions;
import dev.reuise.web.core.graphics.svg.WebSvgShape;
import dev.reuise.web.core.graphics.svg.WebSvgShapeOptions;
import dev.reuise.web.core.graphics.svg.WebSvgText;
import dev.reuise.web.core.graphics.svg.WebSvgTextOptions;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.image.WebImage;
import dev.reuise.web.core.image.WebImageOptions;
import dev.reuise.web.core.input.WebBasicInputField;
import dev.reuise.web.core.input.WebBasicInputFieldOptions;
import dev.reuise.web.core.input.WebChipField;
import dev.reuise.web.core.input.WebChipFieldOptions;
import dev.reuise.web.core.input.WebMultiEmailAddressField;
import dev.reuise.web.core.input.WebMultiEmailAddressFieldOptions;
import dev.reuise.web.core.input.WebPasswordField;
import dev.reuise.web.core.input.WebPasswordFieldOptions;
import dev.reuise.web.core.input.WebSearchField;
import dev.reuise.web.core.input.WebSearchFieldOptions;
import dev.reuise.web.core.input.WebSegmentedTextField;
import dev.reuise.web.core.input.WebSegmentedTextFieldOptions;
import dev.reuise.web.core.input.WebTextField;
import dev.reuise.web.core.input.WebTextFieldOptions;
import dev.reuise.web.core.layout.WebColumnLayout;
import dev.reuise.web.core.layout.WebColumnLayoutOptions;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFieldSet;
import dev.reuise.web.core.layout.WebFieldSetOptions;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.layout.WebRowLayout;
import dev.reuise.web.core.layout.WebRowLayoutOptions;
import dev.reuise.web.core.layout.WebSheetLayout;
import dev.reuise.web.core.layout.WebSheetLayoutOptions;
import dev.reuise.web.core.layout.WebSurface;
import dev.reuise.web.core.layout.WebSurfaceOptions;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.link.WebLinkOptions;
import dev.reuise.web.core.link.WebNavigationLink;
import dev.reuise.web.core.link.WebNavigationLinkOptions;
import dev.reuise.web.core.list.WebBasicList;
import dev.reuise.web.core.list.WebBasicListItem;
import dev.reuise.web.core.list.WebBasicListItemOptions;
import dev.reuise.web.core.list.WebBasicListOptions;
import dev.reuise.web.core.list.WebListItem;
import dev.reuise.web.core.list.WebListItemOptions;
import dev.reuise.web.core.list.WebListView;
import dev.reuise.web.core.list.WebListViewOptions;
import dev.reuise.web.core.media.WebAudioPlayer;
import dev.reuise.web.core.media.WebAudioPlayerOptions;
import dev.reuise.web.core.media.WebMediaPlayer;
import dev.reuise.web.core.media.WebMediaPlayerOptions;
import dev.reuise.web.core.media.WebTextTrack;
import dev.reuise.web.core.media.WebTextTrackOptions;
import dev.reuise.web.core.media.WebVideoPlayer;
import dev.reuise.web.core.media.WebVideoPlayerOptions;
import dev.reuise.web.core.menu.WebMenu;
import dev.reuise.web.core.menu.WebMenuButton;
import dev.reuise.web.core.menu.WebMenuButtonItem;
import dev.reuise.web.core.menu.WebMenuButtonItemOptions;
import dev.reuise.web.core.menu.WebMenuButtonOptions;
import dev.reuise.web.core.menu.WebMenuDivider;
import dev.reuise.web.core.menu.WebMenuDividerOptions;
import dev.reuise.web.core.menu.WebMenuItem;
import dev.reuise.web.core.menu.WebMenuItemOptions;
import dev.reuise.web.core.menu.WebMenuOptions;
import dev.reuise.web.core.navigation.WebNavigationTree;
import dev.reuise.web.core.navigation.WebNavigationTreeGroup;
import dev.reuise.web.core.navigation.WebNavigationTreeGroupOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeLink;
import dev.reuise.web.core.navigation.WebNavigationTreeLinkOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeOptions;
import dev.reuise.web.core.overflow.WebOverflowBar;
import dev.reuise.web.core.overflow.WebOverflowBarOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.progressindicator.WebProgressIndicator;
import dev.reuise.web.core.progressindicator.WebProgressIndicatorOptions;
import dev.reuise.web.core.regionselector.WebRegionSelector;
import dev.reuise.web.core.regionselector.WebRegionSelectorOptions;
import dev.reuise.web.core.scriptcomponent.WebScriptComponent;
import dev.reuise.web.core.scriptcomponent.WebScriptComponentOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainer;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerEdge;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerEdgeOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollArea;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaOptions;
import dev.reuise.web.core.selectmenu.WebSelectMenu;
import dev.reuise.web.core.selectmenu.WebSelectMenuOptions;
import dev.reuise.web.core.skeleton.WebSkeleton;
import dev.reuise.web.core.skeleton.WebSkeletonOptions;
import dev.reuise.web.core.slidecontainer.WebSlideContainer;
import dev.reuise.web.core.slidecontainer.WebSlideContainerEdge;
import dev.reuise.web.core.slidecontainer.WebSlideContainerEdgeOptions;
import dev.reuise.web.core.slidecontainer.WebSlideContainerOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainer;
import dev.reuise.web.core.splitcontainer.WebSplitContainerDivider;
import dev.reuise.web.core.splitcontainer.WebSplitContainerDividerOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanel;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanelOptions;
import dev.reuise.web.core.table.WebCheckboxTableCell;
import dev.reuise.web.core.table.WebCheckboxTableCellOptions;
import dev.reuise.web.core.table.WebCheckboxTableColumn;
import dev.reuise.web.core.table.WebCheckboxTableColumnOptions;
import dev.reuise.web.core.table.WebTable;
import dev.reuise.web.core.table.WebTableBody;
import dev.reuise.web.core.table.WebTableBodyOptions;
import dev.reuise.web.core.table.WebTableCell;
import dev.reuise.web.core.table.WebTableCellOptions;
import dev.reuise.web.core.table.WebTableColumn;
import dev.reuise.web.core.table.WebTableColumnGroup;
import dev.reuise.web.core.table.WebTableColumnGroupOptions;
import dev.reuise.web.core.table.WebTableColumnOptions;
import dev.reuise.web.core.table.WebTableFooter;
import dev.reuise.web.core.table.WebTableFooterOptions;
import dev.reuise.web.core.table.WebTableHeader;
import dev.reuise.web.core.table.WebTableHeaderCell;
import dev.reuise.web.core.table.WebTableHeaderCellOptions;
import dev.reuise.web.core.table.WebTableHeaderOptions;
import dev.reuise.web.core.table.WebTableHeaderRow;
import dev.reuise.web.core.table.WebTableHeaderRowOptions;
import dev.reuise.web.core.table.WebTableOptions;
import dev.reuise.web.core.table.WebTableRow;
import dev.reuise.web.core.table.WebTableRowOptions;
import dev.reuise.web.core.tabs.WebTab;
import dev.reuise.web.core.tabs.WebTabBar;
import dev.reuise.web.core.tabs.WebTabBarOptions;
import dev.reuise.web.core.tabs.WebTabOptions;
import dev.reuise.web.core.text.WebHeading;
import dev.reuise.web.core.text.WebHeadingOptions;
import dev.reuise.web.core.text.WebIconLabel;
import dev.reuise.web.core.text.WebIconLabelOptions;
import dev.reuise.web.core.text.WebInlineText;
import dev.reuise.web.core.text.WebInlineTextOptions;
import dev.reuise.web.core.text.WebLabel;
import dev.reuise.web.core.text.WebLabelOptions;
import dev.reuise.web.core.text.WebLineBreak;
import dev.reuise.web.core.text.WebLineBreakOptions;
import dev.reuise.web.core.text.WebParagraph;
import dev.reuise.web.core.text.WebParagraphOptions;
import dev.reuise.web.core.text.WebRotatingText;
import dev.reuise.web.core.text.WebRotatingTextOptions;
import dev.reuise.web.core.text.WebText;
import dev.reuise.web.core.text.WebTextBlock;
import dev.reuise.web.core.text.WebTextBlockOptions;
import dev.reuise.web.core.text.WebTextOptions;
import dev.reuise.web.core.topappbar.WebTopAppBar;
import dev.reuise.web.core.topappbar.WebTopAppBarOptions;
import dev.reuise.web.core.view.WebRouteLayout;
import dev.reuise.web.core.view.WebRouteLayoutOptions;
import dev.reuise.web.core.view.WebSheetRouteLayout;
import dev.reuise.web.core.view.WebSheetRouteLayoutOptions;
import dev.reuise.web.core.view.WebSheetView;
import dev.reuise.web.core.view.WebSheetViewOptions;
import dev.reuise.web.core.view.WebView;
import dev.reuise.web.core.view.WebViewOptions;
import dev.reuise.webstyles.StyleSheet;
public interface WebComponentFactory extends CoreComponentFactory {
    WebLabel createLabel(CoreLabelOptions options);

    WebLabelOptions createLabelOptions();

    WebTab createTab(CoreTabOptions options);

    WebTabOptions createTabOptions();

    WebAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options);

    WebAudioPlayerOptions createAudioPlayerOptions();

    WebMenuButtonItem createMenuButtonItem(CoreMenuButtonItemOptions options);

    WebMenuButtonItemOptions createMenuButtonItemOptions();

    WebIconLabel createIconLabel(CoreIconLabelOptions options);

    WebIconLabelOptions createIconLabelOptions();

    WebTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options);

    WebTableHeaderCellOptions createTableHeaderCellOptions();

    WebNavigationTreeLink createNavigationTreeLink(CoreNavigationTreeLinkOptions options);

    WebNavigationTreeLinkOptions createNavigationTreeLinkOptions();

    WebPasswordField createPasswordField(CorePasswordFieldOptions options);

    WebPasswordFieldOptions createPasswordFieldOptions();

    WebMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options);

    WebMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions();

    WebSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options);

    WebSlideContainerEdgeOptions createSlideContainerEdgeOptions();

    WebSvgGroup createSvgGroup(WebSvgGroupOptions options);

    WebSvgGroupOptions createSvgGroupOptions();

    WebBasicInputField createBasicInputField(CoreBasicInputFieldOptions options);

    WebBasicInputFieldOptions createBasicInputFieldOptions();

    WebHeading createHeading(CoreHeadingOptions options);

    WebHeadingOptions createHeadingOptions();

    WebScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options);

    WebScrollableContainerEdgeOptions createScrollableContainerEdgeOptions();

    WebDocument createDocument(WebDocumentOptions options);

    WebDocumentOptions createDocumentOptions();

    WebMenuItem createMenuItem(CoreMenuItemOptions options);

    WebMenuItemOptions createMenuItemOptions();

    WebCardGrid createCardGrid(CoreCardGridOptions options);

    WebCardGridOptions createCardGridOptions();

    WebDrawer createDrawer(CoreDrawerOptions options);

    WebDrawerOptions createDrawerOptions();

    WebChipField createChipField(CoreChipFieldOptions options);

    WebChipFieldOptions createChipFieldOptions();

    WebSvg createSvg(WebSvgOptions options);

    WebSvgOptions createSvgOptions();

    WebAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options);

    WebAppLayoutBodyOptions createAppLayoutBodyOptions();

    WebListItem createListItem(CoreListItemOptions options);

    WebListItemOptions createListItemOptions();

    WebSvgRect createSvgRect(WebSvgRectOptions options);

    WebSvgRectOptions createSvgRectOptions();

    WebFlexContainer createFlexContainer(CoreFlexContainerOptions options);

    WebFlexContainerOptions createFlexContainerOptions();

    WebSheetLayout createSheetLayout(CoreSheetLayoutOptions options);

    WebSheetLayoutOptions createSheetLayoutOptions();

    WebLink createLink(CoreLinkOptions options);

    WebLinkOptions createLinkOptions();

    WebFilterChip createFilterChip(CoreFilterChipOptions options);

    WebFilterChipOptions createFilterChipOptions();

    WebMenu createMenu(CoreMenuOptions options);

    WebMenuOptions createMenuOptions();

    WebNavigationTreeGroup createNavigationTreeGroup(CoreNavigationTreeGroupOptions options);

    WebNavigationTreeGroupOptions createNavigationTreeGroupOptions();

    WebFloatingPanel createFloatingPanel(CoreFloatingPanelOptions options);

    WebFloatingPanelOptions createFloatingPanelOptions();

    WebDialog createDialog(CoreDialogOptions options);

    WebDialogOptions createDialogOptions();

    WebButton createButton(CoreButtonOptions options);

    WebButtonOptions createButtonOptions();

    WebContainer createContainer(CoreContainerOptions options);

    WebContainerOptions createContainerOptions();

    WebVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options);

    WebVideoPlayerOptions createVideoPlayerOptions();

    WebDropZone createDropZone(CoreDropZoneOptions options);

    WebDropZoneOptions createDropZoneOptions();

    WebParentComponent createParentComponent(CoreParentComponentPartOptions options);

    WebParentComponentOptions createParentComponentOptions();

    WebCurrencySelector createCurrencySelector(CoreCurrencySelectorOptions options);

    WebCurrencySelectorOptions createCurrencySelectorOptions();

    WebChip createChip(CoreChipOptions options);

    WebChipOptions createChipOptions();

    WebSvgText createSvgText(WebSvgTextOptions options);

    WebSvgTextOptions createSvgTextOptions();

    WebSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options);

    WebSplitContainerPanelOptions createSplitContainerPanelOptions();

    WebTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options);

    WebTableHeaderRowOptions createTableHeaderRowOptions();

    WebLineBreak createLineBreak(CoreLineBreakOptions options);

    WebLineBreakOptions createLineBreakOptions();

    WebSheetRouteLayout createSheetRouteLayout(WebSheetRouteLayoutOptions options);

    WebSheetRouteLayoutOptions createSheetRouteLayoutOptions();

    WebConsentBanner createConsentBanner(CoreConsentBannerOptions options);

    WebConsentBannerOptions createConsentBannerOptions();

    WebTextBlock createTextBlock(CoreTextBlockOptions options);

    WebTextBlockOptions createTextBlockOptions();

    WebMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options);

    WebMediaPlayerOptions createMediaPlayerOptions();

    WebFloatingActionButton createFloatingActionButton(CoreFloatingActionButtonOptions options);

    WebFloatingActionButtonOptions createFloatingActionButtonOptions();

    WebAppLayout createAppLayout(CoreAppLayoutOptions options);

    WebAppLayoutOptions createAppLayoutOptions();

    WebTabBar createTabBar(CoreTabBarOptions options);

    WebTabBarOptions createTabBarOptions();

    WebAvatar createAvatar(CoreAvatarOptions options);

    WebAvatarOptions createAvatarOptions();

    WebRouteLayout createRouteLayout(WebRouteLayoutOptions options);

    WebRouteLayoutOptions createRouteLayoutOptions();

    WebSelectMenu createSelectMenu(CoreSelectMenuOptions options);

    WebSelectMenuOptions createSelectMenuOptions();

    WebFieldSet createFieldSet(CoreFieldSetOptions options);

    WebFieldSetOptions createFieldSetOptions();

    WebRowLayout createRowLayout(CoreRowLayoutOptions options);

    WebRowLayoutOptions createRowLayoutOptions();

    WebProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options);

    WebProgressIndicatorOptions createProgressIndicatorOptions();

    WebSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options);

    WebSegmentedTextFieldOptions createSegmentedTextFieldOptions();

    WebView createView(CoreViewOptions options);

    WebViewOptions createViewOptions();

    WebBasicListItem createBasicListItem(CoreBasicListItemOptions options);

    WebBasicListItemOptions createBasicListItemOptions();

    WebTableRow createTableRow(CoreTableRowOptions options);

    WebTableRowOptions createTableRowOptions();

    WebParagraph createParagraph(CoreParagraphOptions options);

    WebParagraphOptions createParagraphOptions();

    WebIconButton createIconButton(CoreIconButtonOptions options);

    WebIconButtonOptions createIconButtonOptions();

    WebSplitContainer createSplitContainer(CoreSplitContainerOptions options);

    WebSplitContainerOptions createSplitContainerOptions();

    WebChipGroup createChipGroup(CoreChipGroupOptions options);

    WebChipGroupOptions createChipGroupOptions();

    WebDivider createDivider(CoreDividerOptions options);

    WebDividerOptions createDividerOptions();

    WebBadge createBadge(CoreBadgeOptions options);

    WebBadgeOptions createBadgeOptions();

    WebMenuDivider createMenuDivider(CoreMenuDividerOptions options);

    WebMenuDividerOptions createMenuDividerOptions();

    WebMenuButton createMenuButton(CoreMenuButtonOptions options);

    WebMenuButtonOptions createMenuButtonOptions();

    WebCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options);

    WebCheckboxTableCellOptions createCheckboxTableCellOptions();

    WebNavigationTree createNavigationTree(CoreNavigationTreeOptions options);

    WebNavigationTreeOptions createNavigationTreeOptions();

    WebSvgImage createSvgImage(WebSvgImageOptions options);

    WebSvgImageOptions createSvgImageOptions();

    WebAccordionItem createAccordionItem(CoreAccordionItemOptions options);

    WebAccordionItemOptions createAccordionItemOptions();

    WebCarousel createCarousel(CoreCarouselOptions options);

    WebCarouselOptions createCarouselOptions();

    WebBasicList createBasicList(CoreBasicListOptions options);

    WebBasicListOptions createBasicListOptions();

    WebCard createCard(CoreCardOptions options);

    WebCardOptions createCardOptions();

    WebRotatingText createRotatingText(CoreRotatingTextOptions options);

    WebRotatingTextOptions createRotatingTextOptions();

    WebRegionSelector createRegionSelector(CoreRegionSelectorOptions options);

    WebRegionSelectorOptions createRegionSelectorOptions();

    WebCheckbox createCheckbox(CoreCheckboxOptions options);

    WebCheckboxOptions createCheckboxOptions();

    WebTableHeader createTableHeader(CoreTableHeaderOptions options);

    WebTableHeaderOptions createTableHeaderOptions();

    WebBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options);

    WebBottomAppBarOptions createBottomAppBarOptions();

    WebChatBox createChatBox(CoreChatBoxOptions options);

    WebChatBoxOptions createChatBoxOptions();

    WebCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options);

    WebCheckboxTableColumnOptions createCheckboxTableColumnOptions();

    WebTableFooter createTableFooter(CoreTableFooterOptions options);

    WebTableFooterOptions createTableFooterOptions();

    WebSheetView createSheetView(CoreSheetViewOptions options);

    WebSheetViewOptions createSheetViewOptions();

    WebTableColumn createTableColumn(CoreTableColumnOptions options);

    WebTableColumnOptions createTableColumnOptions();

    WebScriptComponent createScriptComponent(WebScriptComponentOptions options);

    WebScriptComponentOptions createScriptComponentOptions();

    WebScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options);

    WebScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions();

    WebDocumentBody createDocumentBody(WebDocumentBodyOptions options);

    WebDocumentBodyOptions createDocumentBodyOptions();

    WebTopAppBar createTopAppBar(CoreTopAppBarOptions options);

    WebTopAppBarOptions createTopAppBarOptions();

    WebAccordion createAccordion(CoreAccordionOptions options);

    WebAccordionOptions createAccordionOptions();

    WebIcon createIcon(CoreIconOptions options);

    WebIconOptions createIconOptions();

    WebNavigationLink createNavigationLink(CoreNavigationLinkOptions options);

    WebNavigationLinkOptions createNavigationLinkOptions();

    WebText createText(CoreTextOptions options);

    WebTextOptions createTextOptions();

    WebBaseComponent createBaseComponent(CoreBaseComponentPartOptions options);

    WebBaseComponentOptions createBaseComponentOptions();

    WebFilePicker createFilePicker(WebFilePickerOptions options);

    WebFilePickerOptions createFilePickerOptions();

    WebTextField createTextField(CoreTextFieldOptions options);

    WebTextFieldOptions createTextFieldOptions();

    WebSlideContainer createSlideContainer(CoreSlideContainerOptions options);

    WebSlideContainerOptions createSlideContainerOptions();

    WebImage createImage(CoreImageOptions options);

    WebImageOptions createImageOptions();

    WebTable createTable(CoreTableOptions options);

    WebTableOptions createTableOptions();

    WebTextTrack createTextTrack(CoreTextTrackOptions options);

    WebTextTrackOptions createTextTrackOptions();

    WebTableBody createTableBody(CoreTableBodyOptions options);

    WebTableBodyOptions createTableBodyOptions();

    WebSkeleton createSkeleton(CoreSkeletonOptions options);

    WebSkeletonOptions createSkeletonOptions();

    WebTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options);

    WebTableColumnGroupOptions createTableColumnGroupOptions();

    WebSvgShape createSvgShape(WebSvgShapeOptions options);

    WebSvgShapeOptions createSvgShapeOptions();

    WebSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options);

    WebSplitContainerDividerOptions createSplitContainerDividerOptions();

    WebInlineText createInlineText(CoreInlineTextOptions options);

    WebInlineTextOptions createInlineTextOptions();

    WebListView createListView(CoreListViewOptions options);

    WebListViewOptions createListViewOptions();

    WebOverflowBar createOverflowBar(CoreOverflowBarOptions options);

    WebOverflowBarOptions createOverflowBarOptions();

    WebTableCell createTableCell(CoreTableCellOptions options);

    WebTableCellOptions createTableCellOptions();

    WebColumnLayout createColumnLayout(CoreColumnLayoutOptions options);

    WebColumnLayoutOptions createColumnLayoutOptions();

    WebMessageDialog createMessageDialog(CoreMessageDialogOptions options);

    WebMessageDialogOptions createMessageDialogOptions();

    WebButtonBar createButtonBar(CoreButtonBarOptions options);

    WebButtonBarOptions createButtonBarOptions();

    WebSearchField createSearchField(CoreSearchFieldOptions options);

    WebSearchFieldOptions createSearchFieldOptions();

    WebBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options);

    WebBasicCheckboxOptions createBasicCheckboxOptions();

    WebScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options);

    WebScrollableContainerOptions createScrollableContainerOptions();

    WebBanner createBanner(CoreBannerOptions options);

    WebBannerOptions createBannerOptions();

    WebSvgPath createSvgPath(WebSvgPathOptions options);

    WebSvgPathOptions createSvgPathOptions();

    WebSurface createSurface(CoreSurfaceOptions options);

    WebSurfaceOptions createSurfaceOptions();

    WebCarouselCard createCarouselCard(CoreCarouselCardOptions options);

    WebCarouselCardOptions createCarouselCardOptions();

    void setRootComponent(RootComponent rootComponent);

    RootComponent getRootComponent();

    StyleSheet getCommonStyleSheet();
}
