package dev.reuise.web.core;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.RootComponent;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.accordion.CoreAccordionOptions;
import dev.reuise.core.applayout.CoreAppLayoutBodyOptions;
import dev.reuise.core.applayout.CoreAppLayoutOptions;
import dev.reuise.core.avatar.CoreAvatarOptions;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.card.CoreCardGridOptions;
import dev.reuise.core.card.CoreCardOptions;
import dev.reuise.core.checkbox.CoreBasicCheckboxOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.core.chip.CoreFilterChipOptions;
import dev.reuise.core.currencyselector.CoreCurrencySelectorOptions;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.dialog.CoreMessageDialogOptions;
import dev.reuise.core.divider.CoreDividerOptions;
import dev.reuise.core.drawer.CoreDrawerOptions;
import dev.reuise.core.dropzone.CoreDropZoneOptions;
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
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.core.menu.CoreMenuOptions;
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
import dev.reuise.web.core.basecomponent.WebBaseComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.bottomappbar.WebBottomAppBar;
import dev.reuise.web.core.bottomappbar.WebBottomAppBarOptions;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.button.WebIconButton;
import dev.reuise.web.core.button.WebIconButtonOptions;
import dev.reuise.web.core.card.WebCard;
import dev.reuise.web.core.card.WebCardGrid;
import dev.reuise.web.core.card.WebCardGridOptions;
import dev.reuise.web.core.card.WebCardOptions;
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
import dev.reuise.web.core.menu.WebMenuDivider;
import dev.reuise.web.core.menu.WebMenuDividerOptions;
import dev.reuise.web.core.menu.WebMenuItem;
import dev.reuise.web.core.menu.WebMenuItemOptions;
import dev.reuise.web.core.menu.WebMenuOptions;
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
    WebNavigationLink createNavigationLink(CoreNavigationLinkOptions options);

    WebNavigationLinkOptions createNavigationLinkOptions();

    WebSvgText createSvgText(WebSvgTextOptions options);

    WebSvgTextOptions createSvgTextOptions();

    WebAppLayout createAppLayout(CoreAppLayoutOptions options);

    WebAppLayoutOptions createAppLayoutOptions();

    WebFilterChip createFilterChip(CoreFilterChipOptions options);

    WebFilterChipOptions createFilterChipOptions();

    WebSvgImage createSvgImage(WebSvgImageOptions options);

    WebSvgImageOptions createSvgImageOptions();

    WebRouteLayout createRouteLayout(WebRouteLayoutOptions options);

    WebRouteLayoutOptions createRouteLayoutOptions();

    WebImage createImage(CoreImageOptions options);

    WebImageOptions createImageOptions();

    WebFilePicker createFilePicker(WebFilePickerOptions options);

    WebFilePickerOptions createFilePickerOptions();

    WebParagraph createParagraph(CoreParagraphOptions options);

    WebParagraphOptions createParagraphOptions();

    WebScriptComponent createScriptComponent(WebScriptComponentOptions options);

    WebScriptComponentOptions createScriptComponentOptions();

    WebTableRow createTableRow(CoreTableRowOptions options);

    WebTableRowOptions createTableRowOptions();

    WebText createText(CoreTextOptions options);

    WebTextOptions createTextOptions();

    WebRegionSelector createRegionSelector(CoreRegionSelectorOptions options);

    WebRegionSelectorOptions createRegionSelectorOptions();

    WebBaseComponent createBaseComponent(CoreBaseComponentPartOptions options);

    WebBaseComponentOptions createBaseComponentOptions();

    WebAccordion createAccordion(CoreAccordionOptions options);

    WebAccordionOptions createAccordionOptions();

    WebDrawer createDrawer(CoreDrawerOptions options);

    WebDrawerOptions createDrawerOptions();

    WebBasicListItem createBasicListItem(CoreBasicListItemOptions options);

    WebBasicListItemOptions createBasicListItemOptions();

    WebLabel createLabel(CoreLabelOptions options);

    WebLabelOptions createLabelOptions();

    WebFlexContainer createFlexContainer(CoreFlexContainerOptions options);

    WebFlexContainerOptions createFlexContainerOptions();

    WebLink createLink(CoreLinkOptions options);

    WebLinkOptions createLinkOptions();

    WebMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options);

    WebMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions();

    WebTableCell createTableCell(CoreTableCellOptions options);

    WebTableCellOptions createTableCellOptions();

    WebButton createButton(CoreButtonOptions options);

    WebButtonOptions createButtonOptions();

    WebTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options);

    WebTableHeaderCellOptions createTableHeaderCellOptions();

    WebIconLabel createIconLabel(CoreIconLabelOptions options);

    WebIconLabelOptions createIconLabelOptions();

    WebColumnLayout createColumnLayout(CoreColumnLayoutOptions options);

    WebColumnLayoutOptions createColumnLayoutOptions();

    WebSlideContainer createSlideContainer(CoreSlideContainerOptions options);

    WebSlideContainerOptions createSlideContainerOptions();

    WebMenuDivider createMenuDivider(CoreMenuDividerOptions options);

    WebMenuDividerOptions createMenuDividerOptions();

    WebSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options);

    WebSegmentedTextFieldOptions createSegmentedTextFieldOptions();

    WebInlineText createInlineText(CoreInlineTextOptions options);

    WebInlineTextOptions createInlineTextOptions();

    WebSheetView createSheetView(CoreSheetViewOptions options);

    WebSheetViewOptions createSheetViewOptions();

    WebListView createListView(CoreListViewOptions options);

    WebListViewOptions createListViewOptions();

    WebMessageDialog createMessageDialog(CoreMessageDialogOptions options);

    WebMessageDialogOptions createMessageDialogOptions();

    WebAvatar createAvatar(CoreAvatarOptions options);

    WebAvatarOptions createAvatarOptions();

    WebSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options);

    WebSplitContainerPanelOptions createSplitContainerPanelOptions();

    WebTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options);

    WebTableHeaderRowOptions createTableHeaderRowOptions();

    WebDocumentBody createDocumentBody(WebDocumentBodyOptions options);

    WebDocumentBodyOptions createDocumentBodyOptions();

    WebMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options);

    WebMediaPlayerOptions createMediaPlayerOptions();

    WebTable createTable(CoreTableOptions options);

    WebTableOptions createTableOptions();

    WebAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options);

    WebAudioPlayerOptions createAudioPlayerOptions();

    WebSvgGroup createSvgGroup(WebSvgGroupOptions options);

    WebSvgGroupOptions createSvgGroupOptions();

    WebCheckbox createCheckbox(CoreCheckboxOptions options);

    WebCheckboxOptions createCheckboxOptions();

    WebMenuItem createMenuItem(CoreMenuItemOptions options);

    WebMenuItemOptions createMenuItemOptions();

    WebTopAppBar createTopAppBar(CoreTopAppBarOptions options);

    WebTopAppBarOptions createTopAppBarOptions();

    WebBadge createBadge(CoreBadgeOptions options);

    WebBadgeOptions createBadgeOptions();

    WebFieldSet createFieldSet(CoreFieldSetOptions options);

    WebFieldSetOptions createFieldSetOptions();

    WebSvgShape createSvgShape(WebSvgShapeOptions options);

    WebSvgShapeOptions createSvgShapeOptions();

    WebTextField createTextField(CoreTextFieldOptions options);

    WebTextFieldOptions createTextFieldOptions();

    WebVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options);

    WebVideoPlayerOptions createVideoPlayerOptions();

    WebTableFooter createTableFooter(CoreTableFooterOptions options);

    WebTableFooterOptions createTableFooterOptions();

    WebTextTrack createTextTrack(CoreTextTrackOptions options);

    WebTextTrackOptions createTextTrackOptions();

    WebSheetLayout createSheetLayout(CoreSheetLayoutOptions options);

    WebSheetLayoutOptions createSheetLayoutOptions();

    WebSkeleton createSkeleton(CoreSkeletonOptions options);

    WebSkeletonOptions createSkeletonOptions();

    WebHeading createHeading(CoreHeadingOptions options);

    WebHeadingOptions createHeadingOptions();

    WebSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options);

    WebSplitContainerDividerOptions createSplitContainerDividerOptions();

    WebMenu createMenu(CoreMenuOptions options);

    WebMenuOptions createMenuOptions();

    WebLineBreak createLineBreak(CoreLineBreakOptions options);

    WebLineBreakOptions createLineBreakOptions();

    WebContainer createContainer(CoreContainerOptions options);

    WebContainerOptions createContainerOptions();

    WebChipGroup createChipGroup(CoreChipGroupOptions options);

    WebChipGroupOptions createChipGroupOptions();

    WebSheetRouteLayout createSheetRouteLayout(WebSheetRouteLayoutOptions options);

    WebSheetRouteLayoutOptions createSheetRouteLayoutOptions();

    WebTabBar createTabBar(CoreTabBarOptions options);

    WebTabBarOptions createTabBarOptions();

    WebTableColumn createTableColumn(CoreTableColumnOptions options);

    WebTableColumnOptions createTableColumnOptions();

    WebCurrencySelector createCurrencySelector(CoreCurrencySelectorOptions options);

    WebCurrencySelectorOptions createCurrencySelectorOptions();

    WebDialog createDialog(CoreDialogOptions options);

    WebDialogOptions createDialogOptions();

    WebPasswordField createPasswordField(CorePasswordFieldOptions options);

    WebPasswordFieldOptions createPasswordFieldOptions();

    WebSearchField createSearchField(CoreSearchFieldOptions options);

    WebSearchFieldOptions createSearchFieldOptions();

    WebCardGrid createCardGrid(CoreCardGridOptions options);

    WebCardGridOptions createCardGridOptions();

    WebScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options);

    WebScrollableContainerOptions createScrollableContainerOptions();

    WebScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options);

    WebScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions();

    WebBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options);

    WebBottomAppBarOptions createBottomAppBarOptions();

    WebSelectMenu createSelectMenu(CoreSelectMenuOptions options);

    WebSelectMenuOptions createSelectMenuOptions();

    WebCard createCard(CoreCardOptions options);

    WebCardOptions createCardOptions();

    WebView createView(CoreViewOptions options);

    WebViewOptions createViewOptions();

    WebSplitContainer createSplitContainer(CoreSplitContainerOptions options);

    WebSplitContainerOptions createSplitContainerOptions();

    WebSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options);

    WebSlideContainerEdgeOptions createSlideContainerEdgeOptions();

    WebDropZone createDropZone(CoreDropZoneOptions options);

    WebDropZoneOptions createDropZoneOptions();

    WebChip createChip(CoreChipOptions options);

    WebChipOptions createChipOptions();

    WebAccordionItem createAccordionItem(CoreAccordionItemOptions options);

    WebAccordionItemOptions createAccordionItemOptions();

    WebAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options);

    WebAppLayoutBodyOptions createAppLayoutBodyOptions();

    WebIcon createIcon(CoreIconOptions options);

    WebIconOptions createIconOptions();

    WebBasicInputField createBasicInputField(CoreBasicInputFieldOptions options);

    WebBasicInputFieldOptions createBasicInputFieldOptions();

    WebSvgPath createSvgPath(WebSvgPathOptions options);

    WebSvgPathOptions createSvgPathOptions();

    WebTableHeader createTableHeader(CoreTableHeaderOptions options);

    WebTableHeaderOptions createTableHeaderOptions();

    WebTableBody createTableBody(CoreTableBodyOptions options);

    WebTableBodyOptions createTableBodyOptions();

    WebTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options);

    WebTableColumnGroupOptions createTableColumnGroupOptions();

    WebSurface createSurface(CoreSurfaceOptions options);

    WebSurfaceOptions createSurfaceOptions();

    WebSvgRect createSvgRect(WebSvgRectOptions options);

    WebSvgRectOptions createSvgRectOptions();

    WebTextBlock createTextBlock(CoreTextBlockOptions options);

    WebTextBlockOptions createTextBlockOptions();

    WebCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options);

    WebCheckboxTableCellOptions createCheckboxTableCellOptions();

    WebDivider createDivider(CoreDividerOptions options);

    WebDividerOptions createDividerOptions();

    WebCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options);

    WebCheckboxTableColumnOptions createCheckboxTableColumnOptions();

    WebProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options);

    WebProgressIndicatorOptions createProgressIndicatorOptions();

    WebScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options);

    WebScrollableContainerEdgeOptions createScrollableContainerEdgeOptions();

    WebSvg createSvg(WebSvgOptions options);

    WebSvgOptions createSvgOptions();

    WebRowLayout createRowLayout(CoreRowLayoutOptions options);

    WebRowLayoutOptions createRowLayoutOptions();

    WebIconButton createIconButton(CoreIconButtonOptions options);

    WebIconButtonOptions createIconButtonOptions();

    WebDocument createDocument(WebDocumentOptions options);

    WebDocumentOptions createDocumentOptions();

    WebParentComponent createParentComponent(CoreParentComponentPartOptions options);

    WebParentComponentOptions createParentComponentOptions();

    WebTab createTab(CoreTabOptions options);

    WebTabOptions createTabOptions();

    WebListItem createListItem(CoreListItemOptions options);

    WebListItemOptions createListItemOptions();

    WebBasicList createBasicList(CoreBasicListOptions options);

    WebBasicListOptions createBasicListOptions();

    WebBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options);

    WebBasicCheckboxOptions createBasicCheckboxOptions();

    WebChipField createChipField(CoreChipFieldOptions options);

    WebChipFieldOptions createChipFieldOptions();

    void setRootComponent(RootComponent rootComponent);

    RootComponent getRootComponent();

    StyleSheet getCommonStyleSheet();
}
