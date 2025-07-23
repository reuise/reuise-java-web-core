package dev.reuise.web.core.view;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.BackdropFilterSetting;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.splitcontainer.SplitDirection;
import dev.reuise.core.theme.Theme;
import dev.reuise.core.view.SheetSize;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.layout.WebSheetLayoutPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainerDivider;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanel;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Direction - CORE
// Option: ReverseDirection - CORE
// Option: Resizable - CORE
// Option: SplitPosition - CORE
// Option: MinSplitPosition - CORE
// Option: MaxSplitPosition - CORE
// Option: Padding - CORE
// Option: PaddingTop - CORE
// Option: PaddingRight - CORE
// Option: PaddingBottom - CORE
// Option: PaddingLeft - CORE
// Option: Position - CORE
// Option: Inset - CORE
// Option: BackdropFilter - CORE
// Option: Children - CORE
// Option: Id - WEB
// Option: TagName - WEB
// Option: XmlNamespace - WEB
// Option: Tooltip - WEB
// Option: BaseStyleClass - WEB
// Option: Attributes - WEB
// Option: StyleClasses - WEB
// Option: Data - WEB
// Option: Style - WEB
// Option: InlineStyle - WEB
// Option: Rehydration - WEB
// Option: ContentEditable - WEB
// Option: StoreInElementOptions - WEB
// Option: Mounted - CORE
// Option: Margin - CORE
// Option: MarginTop - CORE
// Option: MarginRight - CORE
// Option: MarginBottom - CORE
// Option: MarginLeft - CORE
// Option: Width - CORE
// Option: MinWidth - CORE
// Option: MaxWidth - CORE
// Option: Height - CORE
// Option: MinHeight - CORE
// Option: MaxHeight - CORE
// Option: RequiredLayoutComponent - CORE
// Option: Parent - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: sheetLayout
// add composition for sheetLayout: setSheetSize
// add composition for sheetLayout: setMinSheetSize
// add composition for sheetLayout: setMaxSheetSize
// base comp: splitContainer
// base comp: container
// add composition for container: addHeading
// add composition for container: addDivider
// add composition for container: addParagraph
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: isRehydrated
// add composition for baseComponent: getComputedStyle
// add composition for baseComponent: addOrRemoveStyleClass
// add composition for baseComponent: hasStyleClass
// add composition for baseComponent: removeStyleClass
// add composition for baseComponent: setAttribute
// add composition for baseComponent: removeAttribute
// add composition for baseComponent: getAttribute
// add composition for baseComponent: hasAttribute
// add composition for baseComponent: setData
// add composition for baseComponent: getData
// add composition for baseComponent: hasData
// add composition for baseComponent: setAria
// add composition for baseComponent: getAria
// add composition for baseComponent: hasAria
// add composition for baseComponent: getUniqueId
// add composition for baseComponent: getUniqueStyleClass
// add composition for baseComponent: getStyleSheetId
// add composition for baseComponent: getStyleStates
// add composition for baseComponent: setStyleSheetFactory
// add composition for baseComponent: getStyle
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultWebSheetRouteLayoutPart<S extends DefaultWebSheetRouteLayoutPart<S, O>, O extends WebSheetRouteLayoutPartOptions> implements WebSheetRouteLayout , WebComponentPart {
    private void setSheetSize(WebSheetView sheetView) {
        setSheetSize(sheetView.getSize());
        setMinSheetSize(sheetView.getMinSize());
        setMaxSheetSize(sheetView.getMaxSize());
    }

    private WebSheetLayoutPart sheetLayoutPart;

    private WebSplitContainerPart splitContainerPart;

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    private WebContainer container;

    private WebSplitContainerPanel startPanel;

    private WebSplitContainerDivider divider;

    private WebSplitContainerPanel endPanel;

    protected WebRouteLayout routeLayout;

    protected DefaultWebSheetRouteLayoutPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        sheetLayoutPart = getSheetLayoutPart();
        splitContainerPart = getSplitContainerPart();
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
        container = getContainer();
        startPanel = getStartPanel();
        divider = getDivider();
        endPanel = getEndPanel();
    }

    public S setSheetSize(Object sheetSize) {
        sheetLayoutPart.setSheetSize(sheetSize);
        return self();
    }

    public S setSheetSize(SheetSize sheetSize) {
        sheetLayoutPart.setSheetSize(sheetSize);
        return self();
    }

    public S setMinSheetSize(Object minSheetSize) {
        sheetLayoutPart.setMinSheetSize(minSheetSize);
        return self();
    }

    public S setMaxSheetSize(Object maxSheetSize) {
        sheetLayoutPart.setMaxSheetSize(maxSheetSize);
        return self();
    }

    @Override
    public RootComponent getRootComponent() {
        return sheetLayoutPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.sheetLayoutPart.setRootComponent(rootComponent);
        if (routeLayout != null)
            routeLayout.setRootComponent(rootComponent);

    }

    // Implementation
    @Override
    public S add(CoreComponent child) {
        this.getStartPanel().add(child);
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        sheetLayoutPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        sheetLayoutPart.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        sheetLayoutPart.remove(child);
    }

    @Override
    public void removeAll() {
        sheetLayoutPart.removeAll();
    }

    @Override
    public SplitDirection getDirection() {
        return splitContainerPart.getDirection();
    }

    @Override
    public S setDirection(SplitDirection direction) {
        this.splitContainerPart.setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(SplitDirection direction, State state) {
        this.splitContainerPart.setDirection(direction, state);
        return self();
    }

    @Override
    public S setDirectionAllStates(SplitDirection direction) {
        setDirection(ScreenSizeValues.of(direction, direction));
        setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(ScreenSizeValues<SplitDirection> direction) {
        this.splitContainerPart.setDirection(direction);
        return self();
    }

    @Override
    public SplitDirection getDirection(State state) {
        return splitContainerPart.getDirection(state);
    }

    @Override
    public boolean isReverseDirection() {
        return splitContainerPart.isReverseDirection();
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection) {
        this.splitContainerPart.setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection, State state) {
        this.splitContainerPart.setReverseDirection(reverseDirection, state);
        return self();
    }

    @Override
    public S setReverseDirectionAllStates(Boolean reverseDirection) {
        setReverseDirection(ScreenSizeValues.of(reverseDirection, reverseDirection));
        setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setReverseDirection(ScreenSizeValues<Boolean> reverseDirection) {
        this.splitContainerPart.setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public boolean isReverseDirection(State state) {
        return splitContainerPart.isReverseDirection(state);
    }

    @Override
    public boolean isResizable() {
        return splitContainerPart.isResizable();
    }

    @Override
    public S setResizable(Boolean resizable) {
        this.splitContainerPart.setResizable(resizable);
        return self();
    }

    @Override
    public Object getSplitPosition() {
        return splitContainerPart.getSplitPosition();
    }

    @Override
    public S setSplitPosition(Object splitPosition) {
        this.splitContainerPart.setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setSplitPosition(Object splitPosition, State state) {
        this.splitContainerPart.setSplitPosition(splitPosition, state);
        return self();
    }

    @Override
    public S setSplitPositionAllStates(Object splitPosition) {
        setSplitPosition(ScreenSizeValues.of(splitPosition, splitPosition));
        setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setSplitPosition(ScreenSizeValues<Object> splitPosition) {
        this.splitContainerPart.setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public Object getSplitPosition(State state) {
        return splitContainerPart.getSplitPosition(state);
    }

    @Override
    public Object getMinSplitPosition() {
        return splitContainerPart.getMinSplitPosition();
    }

    @Override
    public S setMinSplitPosition(Object minSplitPosition) {
        this.splitContainerPart.setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMinSplitPosition(Object minSplitPosition, State state) {
        this.splitContainerPart.setMinSplitPosition(minSplitPosition, state);
        return self();
    }

    @Override
    public S setMinSplitPositionAllStates(Object minSplitPosition) {
        setMinSplitPosition(ScreenSizeValues.of(minSplitPosition, minSplitPosition));
        setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMinSplitPosition(ScreenSizeValues<Object> minSplitPosition) {
        this.splitContainerPart.setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public Object getMinSplitPosition(State state) {
        return splitContainerPart.getMinSplitPosition(state);
    }

    @Override
    public Object getMaxSplitPosition() {
        return splitContainerPart.getMaxSplitPosition();
    }

    @Override
    public S setMaxSplitPosition(Object maxSplitPosition) {
        this.splitContainerPart.setMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPosition(Object maxSplitPosition, State state) {
        this.splitContainerPart.setMaxSplitPosition(maxSplitPosition, state);
        return self();
    }

    @Override
    public S setMaxSplitPositionAllStates(Object maxSplitPosition) {
        setMaxSplitPosition(ScreenSizeValues.of(maxSplitPosition, maxSplitPosition));
        setMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPosition(ScreenSizeValues<Object> maxSplitPosition) {
        this.splitContainerPart.setMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public Object getMaxSplitPosition(State state) {
        return splitContainerPart.getMaxSplitPosition(state);
    }

    @Override
    public Object getPadding() {
        return containerPart.getPadding();
    }

    @Override
    public S setPadding(Object padding) {
        this.containerPart.setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(Object padding, State state) {
        this.containerPart.setPadding(padding, state);
        return self();
    }

    @Override
    public S setPaddingAllStates(Object padding) {
        setPadding(ScreenSizeValues.of(padding, padding));
        setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(ScreenSizeValues<Object> padding) {
        this.containerPart.setPadding(padding);
        return self();
    }

    @Override
    public Object getPadding(State state) {
        return containerPart.getPadding(state);
    }

    @Override
    public Object getPaddingTop() {
        return containerPart.getPaddingTop();
    }

    @Override
    public S setPaddingTop(Object paddingTop) {
        this.containerPart.setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(Object paddingTop, State state) {
        this.containerPart.setPaddingTop(paddingTop, state);
        return self();
    }

    @Override
    public S setPaddingTopAllStates(Object paddingTop) {
        setPaddingTop(ScreenSizeValues.of(paddingTop, paddingTop));
        setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(ScreenSizeValues<Object> paddingTop) {
        this.containerPart.setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public Object getPaddingTop(State state) {
        return containerPart.getPaddingTop(state);
    }

    @Override
    public Object getPaddingRight() {
        return containerPart.getPaddingRight();
    }

    @Override
    public S setPaddingRight(Object paddingRight) {
        this.containerPart.setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(Object paddingRight, State state) {
        this.containerPart.setPaddingRight(paddingRight, state);
        return self();
    }

    @Override
    public S setPaddingRightAllStates(Object paddingRight) {
        setPaddingRight(ScreenSizeValues.of(paddingRight, paddingRight));
        setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(ScreenSizeValues<Object> paddingRight) {
        this.containerPart.setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public Object getPaddingRight(State state) {
        return containerPart.getPaddingRight(state);
    }

    @Override
    public Object getPaddingBottom() {
        return containerPart.getPaddingBottom();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom) {
        this.containerPart.setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom, State state) {
        this.containerPart.setPaddingBottom(paddingBottom, state);
        return self();
    }

    @Override
    public S setPaddingBottomAllStates(Object paddingBottom) {
        setPaddingBottom(ScreenSizeValues.of(paddingBottom, paddingBottom));
        setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(ScreenSizeValues<Object> paddingBottom) {
        this.containerPart.setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public Object getPaddingBottom(State state) {
        return containerPart.getPaddingBottom(state);
    }

    @Override
    public Object getPaddingLeft() {
        return containerPart.getPaddingLeft();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft) {
        this.containerPart.setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft, State state) {
        this.containerPart.setPaddingLeft(paddingLeft, state);
        return self();
    }

    @Override
    public S setPaddingLeftAllStates(Object paddingLeft) {
        setPaddingLeft(ScreenSizeValues.of(paddingLeft, paddingLeft));
        setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(ScreenSizeValues<Object> paddingLeft) {
        this.containerPart.setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public Object getPaddingLeft(State state) {
        return containerPart.getPaddingLeft(state);
    }

    @Override
    public String getPosition() {
        return containerPart.getPosition();
    }

    @Override
    public S setPosition(String position) {
        this.containerPart.setPosition(position);
        return self();
    }

    @Override
    public S setPosition(String position, State state) {
        this.containerPart.setPosition(position, state);
        return self();
    }

    @Override
    public S setPositionAllStates(String position) {
        setPosition(ScreenSizeValues.of(position, position));
        setPosition(position);
        return self();
    }

    @Override
    public S setPosition(ScreenSizeValues<String> position) {
        this.containerPart.setPosition(position);
        return self();
    }

    @Override
    public String getPosition(State state) {
        return containerPart.getPosition(state);
    }

    @Override
    public Object getInset() {
        return containerPart.getInset();
    }

    @Override
    public S setInset(Object inset) {
        this.containerPart.setInset(inset);
        return self();
    }

    @Override
    public S setInset(Object inset, State state) {
        this.containerPart.setInset(inset, state);
        return self();
    }

    @Override
    public S setInsetAllStates(Object inset) {
        setInset(ScreenSizeValues.of(inset, inset));
        setInset(inset);
        return self();
    }

    @Override
    public S setInset(ScreenSizeValues<Object> inset) {
        this.containerPart.setInset(inset);
        return self();
    }

    @Override
    public Object getInset(State state) {
        return containerPart.getInset(state);
    }

    @Override
    public BackdropFilterSetting getBackdropFilter() {
        return containerPart.getBackdropFilter();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter) {
        this.containerPart.setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter, State state) {
        this.containerPart.setBackdropFilter(backdropFilter, state);
        return self();
    }

    @Override
    public S setBackdropFilterAllStates(BackdropFilterSetting backdropFilter) {
        setBackdropFilter(ScreenSizeValues.of(backdropFilter, backdropFilter));
        setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(ScreenSizeValues<BackdropFilterSetting> backdropFilter) {
        this.containerPart.setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public BackdropFilterSetting getBackdropFilter(State state) {
        return containerPart.getBackdropFilter(state);
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        sheetLayoutPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        sheetLayoutPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        sheetLayoutPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        sheetLayoutPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        sheetLayoutPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        sheetLayoutPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        sheetLayoutPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        sheetLayoutPart.addParagraph(html);
        return self();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return parentComponentPart.getChildren();
    }

    @Override
    public S setChildren(List<CoreComponent> children) {
        this.parentComponentPart.setChildren(children);
        return self();
    }

    @Override
    public S setChild(CoreComponent child) {
        parentComponentPart.setChild(child);
        return self();
    }

    @Override
    public S removeChild(CoreComponent child) {
        parentComponentPart.removeChild(child);
        return self();
    }

    @Override
    public String getId() {
        return baseComponentPart.getId();
    }

    @Override
    public S setId(String id) {
        this.baseComponentPart.setId(id);
        return self();
    }

    @Override
    public String getTagName() {
        return baseComponentPart.getTagName();
    }

    @Override
    public S setTagName(String tagName) {
        this.baseComponentPart.setTagName(tagName);
        return self();
    }

    @Override
    public String getXmlNamespace() {
        return baseComponentPart.getXmlNamespace();
    }

    @Override
    public S setXmlNamespace(String xmlNamespace) {
        this.baseComponentPart.setXmlNamespace(xmlNamespace);
        return self();
    }

    @Override
    public String getTooltip() {
        return baseComponentPart.getTooltip();
    }

    @Override
    public S setTooltip(String tooltip) {
        this.baseComponentPart.setTooltip(tooltip);
        return self();
    }

    @Override
    public String getBaseStyleClass() {
        return baseComponentPart.getBaseStyleClass();
    }

    @Override
    public S setBaseStyleClass(String baseStyleClass) {
        this.baseComponentPart.setBaseStyleClass(baseStyleClass);
        return self();
    }

    @Override
    public Map<String, String> getAttributes() {
        return baseComponentPart.getAttributes();
    }

    @Override
    public S setAttributes(Map<String, String> attributes) {
        this.baseComponentPart.setAttributes(attributes);
        return self();
    }

    @Override
    public List<String> getStyleClasses() {
        return baseComponentPart.getStyleClasses();
    }

    @Override
    public S setStyleClasses(List<String> styleClasses) {
        this.baseComponentPart.setStyleClasses(styleClasses);
        return self();
    }

    @Override
    public S addStyleClass(String styleClass) {
        this.baseComponentPart.addStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClass(String styleClass) {
        baseComponentPart.setStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClasses(String... styleClasses) {
        baseComponentPart.setStyleClasses(styleClasses);
        return self();
    }

    @Override
    public Map<String, String> getData() {
        return baseComponentPart.getData();
    }

    @Override
    public S setData(Map<String, String> data) {
        this.baseComponentPart.setData(data);
        return self();
    }

    @Override
    public Style getStyle() {
        return baseComponentPart.getStyle();
    }

    @Override
    public S setStyle(Style style) {
        this.baseComponentPart.setStyle(style);
        return self();
    }

    @Override
    public S setStyle(Style style, State state) {
        this.baseComponentPart.setStyle(style, state);
        return self();
    }

    @Override
    public S setStyleAllStates(Style style) {
        setStyle(ScreenSizeValues.of(style, style));
        setStyle(style);
        return self();
    }

    @Override
    public S setStyle(ScreenSizeValues<Style> style) {
        this.baseComponentPart.setStyle(style);
        return self();
    }

    @Override
    public Style getStyle(State state) {
        return baseComponentPart.getStyle(state);
    }

    @Override
    public Style getInlineStyle() {
        return baseComponentPart.getInlineStyle();
    }

    @Override
    public S setInlineStyle(Style inlineStyle) {
        this.baseComponentPart.setInlineStyle(inlineStyle);
        return self();
    }

    @Override
    public String getRehydration() {
        return baseComponentPart.getRehydration();
    }

    @Override
    public S setRehydration(String rehydration) {
        this.baseComponentPart.setRehydration(rehydration);
        return self();
    }

    @Override
    public boolean isContentEditable() {
        return baseComponentPart.isContentEditable();
    }

    @Override
    public S setContentEditable(Boolean contentEditable) {
        this.baseComponentPart.setContentEditable(contentEditable);
        return self();
    }

    @Override
    public List<String> getStoreInElementOptions() {
        return baseComponentPart.getStoreInElementOptions();
    }

    @Override
    public S setStoreInElementOptions(List<String> storeInElementOptions) {
        this.baseComponentPart.setStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S addStoreInElementOptions(String storeInElementOptions) {
        this.baseComponentPart.addStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S setStoreInElementOptions(String storeInElementOptions) {
        baseComponentPart.setStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S removeStoreInElementOptions(String storeInElementOptions) {
        baseComponentPart.removeStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public boolean hasStoreInElementOptions(String storeInElementOptions) {
        return baseComponentPart.hasStoreInElementOptions(storeInElementOptions);
    }

    @Override
    public boolean isMounted() {
        return baseComponentPart.isMounted();
    }

    @Override
    public S setMounted(Boolean mounted) {
        this.baseComponentPart.setMounted(mounted);
        return self();
    }

    @Override
    public Object getMargin() {
        return baseComponentPart.getMargin();
    }

    @Override
    public S setMargin(Object margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(Object margin, State state) {
        this.baseComponentPart.setMargin(margin, state);
        return self();
    }

    @Override
    public S setMarginAllStates(Object margin) {
        setMargin(ScreenSizeValues.of(margin, margin));
        setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(ScreenSizeValues<Object> margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public Object getMargin(State state) {
        return baseComponentPart.getMargin(state);
    }

    @Override
    public Object getMarginTop() {
        return baseComponentPart.getMarginTop();
    }

    @Override
    public S setMarginTop(Object marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(Object marginTop, State state) {
        this.baseComponentPart.setMarginTop(marginTop, state);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        setMarginTop(ScreenSizeValues.of(marginTop, marginTop));
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(ScreenSizeValues<Object> marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public Object getMarginTop(State state) {
        return baseComponentPart.getMarginTop(state);
    }

    @Override
    public Object getMarginRight() {
        return baseComponentPart.getMarginRight();
    }

    @Override
    public S setMarginRight(Object marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(Object marginRight, State state) {
        this.baseComponentPart.setMarginRight(marginRight, state);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        setMarginRight(ScreenSizeValues.of(marginRight, marginRight));
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(ScreenSizeValues<Object> marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public Object getMarginRight(State state) {
        return baseComponentPart.getMarginRight(state);
    }

    @Override
    public Object getMarginBottom() {
        return baseComponentPart.getMarginBottom();
    }

    @Override
    public S setMarginBottom(Object marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(Object marginBottom, State state) {
        this.baseComponentPart.setMarginBottom(marginBottom, state);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        setMarginBottom(ScreenSizeValues.of(marginBottom, marginBottom));
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(ScreenSizeValues<Object> marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public Object getMarginBottom(State state) {
        return baseComponentPart.getMarginBottom(state);
    }

    @Override
    public Object getMarginLeft() {
        return baseComponentPart.getMarginLeft();
    }

    @Override
    public S setMarginLeft(Object marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(Object marginLeft, State state) {
        this.baseComponentPart.setMarginLeft(marginLeft, state);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        setMarginLeft(ScreenSizeValues.of(marginLeft, marginLeft));
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(ScreenSizeValues<Object> marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public Object getMarginLeft(State state) {
        return baseComponentPart.getMarginLeft(state);
    }

    @Override
    public Object getWidth() {
        return baseComponentPart.getWidth();
    }

    @Override
    public S setWidth(Object width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public S setWidth(Object width, State state) {
        this.baseComponentPart.setWidth(width, state);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        setWidth(ScreenSizeValues.of(width, width));
        setWidth(width);
        return self();
    }

    @Override
    public S setWidth(ScreenSizeValues<Object> width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public Object getWidth(State state) {
        return baseComponentPart.getWidth(state);
    }

    @Override
    public Object getMinWidth() {
        return baseComponentPart.getMinWidth();
    }

    @Override
    public S setMinWidth(Object minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(Object minWidth, State state) {
        this.baseComponentPart.setMinWidth(minWidth, state);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        setMinWidth(ScreenSizeValues.of(minWidth, minWidth));
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(ScreenSizeValues<Object> minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public Object getMinWidth(State state) {
        return baseComponentPart.getMinWidth(state);
    }

    @Override
    public Object getMaxWidth() {
        return baseComponentPart.getMaxWidth();
    }

    @Override
    public S setMaxWidth(Object maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(Object maxWidth, State state) {
        this.baseComponentPart.setMaxWidth(maxWidth, state);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        setMaxWidth(ScreenSizeValues.of(maxWidth, maxWidth));
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(ScreenSizeValues<Object> maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public Object getMaxWidth(State state) {
        return baseComponentPart.getMaxWidth(state);
    }

    @Override
    public Object getHeight() {
        return baseComponentPart.getHeight();
    }

    @Override
    public S setHeight(Object height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public S setHeight(Object height, State state) {
        this.baseComponentPart.setHeight(height, state);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        setHeight(ScreenSizeValues.of(height, height));
        setHeight(height);
        return self();
    }

    @Override
    public S setHeight(ScreenSizeValues<Object> height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public Object getHeight(State state) {
        return baseComponentPart.getHeight(state);
    }

    @Override
    public Object getMinHeight() {
        return baseComponentPart.getMinHeight();
    }

    @Override
    public S setMinHeight(Object minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(Object minHeight, State state) {
        this.baseComponentPart.setMinHeight(minHeight, state);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        setMinHeight(ScreenSizeValues.of(minHeight, minHeight));
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(ScreenSizeValues<Object> minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public Object getMinHeight(State state) {
        return baseComponentPart.getMinHeight(state);
    }

    @Override
    public Object getMaxHeight() {
        return baseComponentPart.getMaxHeight();
    }

    @Override
    public S setMaxHeight(Object maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(Object maxHeight, State state) {
        this.baseComponentPart.setMaxHeight(maxHeight, state);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        setMaxHeight(ScreenSizeValues.of(maxHeight, maxHeight));
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(ScreenSizeValues<Object> maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public Object getMaxHeight(State state) {
        return baseComponentPart.getMaxHeight(state);
    }

    @Override
    public boolean isRequiredLayoutComponent() {
        return baseComponentPart.isRequiredLayoutComponent();
    }

    @Override
    public S setRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        this.baseComponentPart.setRequiredLayoutComponent(requiredLayoutComponent);
        return self();
    }

    @Override
    public CoreComponent getParent() {
        return baseComponentPart.getParent();
    }

    @Override
    public S setParent(CoreComponent parent) {
        this.baseComponentPart.setParent(parent);
        return self();
    }

    @Override
    public CoreParentComponent getWrapper() {
        return baseComponentPart.getWrapper();
    }

    @Override
    public S setWrapper(CoreParentComponent wrapper) {
        this.baseComponentPart.setWrapper(wrapper);
        return self();
    }

    @Override
    public Theme getTheme() {
        return baseComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.baseComponentPart.setTheme(theme);
        return self();
    }

    @Override
    public boolean isVisible() {
        return baseComponentPart.isVisible();
    }

    @Override
    public S setVisible(Boolean visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(Boolean visible, State state) {
        this.baseComponentPart.setVisible(visible, state);
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(ScreenSizeValues<Boolean> visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public boolean isVisible(State state) {
        return baseComponentPart.isVisible(state);
    }

    @Override
    public boolean isEnabled() {
        return baseComponentPart.isEnabled();
    }

    @Override
    public S setEnabled(Boolean enabled) {
        this.baseComponentPart.setEnabled(enabled);
        return self();
    }

    @Override
    public boolean isFocused() {
        return baseComponentPart.isFocused();
    }

    @Override
    public S setFocused(Boolean focused) {
        this.baseComponentPart.setFocused(focused);
        return self();
    }

    @Override
    public boolean isDebug() {
        return baseComponentPart.isDebug();
    }

    @Override
    public S setDebug(Boolean debug) {
        this.baseComponentPart.setDebug(debug);
        return self();
    }

    @Override
    public String getDebugId() {
        return baseComponentPart.getDebugId();
    }

    @Override
    public S setDebugId(String debugId) {
        this.baseComponentPart.setDebugId(debugId);
        return self();
    }

    @Override
    public S setRehydration(String rehydration, Boolean canFail) {
        this.baseComponentPart.setRehydration(rehydration, canFail);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent) {
        this.baseComponentPart.setRehydration(selector, parent);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent, Boolean canFail) {
        this.baseComponentPart.setRehydration(selector, parent, canFail);
        return self();
    }

    public boolean isRehydrated() {
        if (sheetLayoutPart == null)
            return false;

        return sheetLayoutPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return sheetLayoutPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        sheetLayoutPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return sheetLayoutPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        sheetLayoutPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        sheetLayoutPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        sheetLayoutPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        sheetLayoutPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return sheetLayoutPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return sheetLayoutPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        sheetLayoutPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return sheetLayoutPart.getData(data);
    }

    public boolean hasData(String data) {
        return sheetLayoutPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        sheetLayoutPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return sheetLayoutPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return sheetLayoutPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return sheetLayoutPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return sheetLayoutPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return sheetLayoutPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return sheetLayoutPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return sheetLayoutPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        sheetLayoutPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return sheetLayoutPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return sheetLayoutPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return sheetLayoutPart.hasWrapper();
    }

    public boolean isInitialized() {
        return sheetLayoutPart.isInitialized();
    }

    public void log(Object obj) {
        sheetLayoutPart.log(obj);
    }

    public void removeFromParent() {
        sheetLayoutPart.removeFromParent();
    }

    @Override
    public WebComponentFactory getComponentFactory() {
        return ((WebComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    @Override
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        baseComponentPart.addPart(type, part);
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        baseComponentPart.initialize(component, options);
    }

    @Override
    public WebSheetRouteLayout getComponent() {
        return ((WebSheetRouteLayout) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        routeLayout = createRouteLayout(options);
        setupReferences();
        return true;
    }

    public WebRouteLayout getRouteLayout() {
        return routeLayout;
    }

    private boolean needsRouteLayout(O options) {
        if (routeLayout != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private WebRouteLayout createRouteLayout(O options) {
        if ((routeLayout != null) || (options == null))
            return routeLayout;

        WebRouteLayoutOptions routeLayoutOptions = options.getRouteLayoutOptions();
        if (routeLayoutOptions == null)
            return routeLayout;

        WebSplitContainerPanel startPanel = getStartPanel();
        WebParentComponentPart parent = (startPanel != null) ? startPanel : getParentComponentPart();
        routeLayoutOptions.setParent(startPanel != null ? startPanel : this);
        ComponentCreator routeLayoutCreator = options.getRouteLayoutCreator();
        routeLayout = (routeLayoutCreator != null) ? ((WebRouteLayout) (routeLayoutCreator.create(routeLayoutOptions))) : getComponentFactory().createRouteLayout(routeLayoutOptions);
        parent.add(routeLayout);
        return routeLayout;
    }

    public void onInitialize(O options) {
    }

    // Implementation
    // Implementation
    public void onCreate(O options) {
        WebRouteLayout routeLayout = getRouteLayout();
        getStartPanel().add(routeLayout);
        WebView currentView = routeLayout.getCurrentView();
        if (currentView instanceof WebSheetView sheetView)
            setSheetSize(sheetView);

        routeLayout.addRevealHandler((view, relvealOpts) -> {
            if (view instanceof WebSheetView sheetView)
                setSheetSize(sheetView);

        });
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        sheetLayoutPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public String getUrl() {
        return routeLayout.getUrl();
    }

    @Override
    public S setUrl(String url) {
        this.routeLayout.setUrl(url);
        return self();
    }

    @Override
    public List<RouteOptions> getRoutes() {
        return routeLayout.getRoutes();
    }

    @Override
    public S setRoutes(List<RouteOptions> routes) {
        this.routeLayout.setRoutes(routes);
        return self();
    }

    @Override
    public S addRoute(RouteOptions route) {
        this.routeLayout.addRoute(route);
        return self();
    }

    @Override
    public S removeRoute(RouteOptions route) {
        routeLayout.removeRoute(route);
        return self();
    }

    @Override
    public boolean hasRoute(RouteOptions route) {
        return routeLayout.hasRoute(route);
    }

    @Override
    public S addRoute(String path, RouteViewCreator creator) {
        this.routeLayout.addRoute(path, creator);
        return self();
    }

    @Override
    public S addRoute(String path, RouteViewCreator creator, boolean preCreate) {
        this.routeLayout.addRoute(path, creator, preCreate);
        return self();
    }

    @Override
    public RouteViewRevealer getRouteViewRevealer() {
        return routeLayout.getRouteViewRevealer();
    }

    @Override
    public S setRouteViewRevealer(RouteViewRevealer routeViewRevealer) {
        this.routeLayout.setRouteViewRevealer(routeViewRevealer);
        return self();
    }

    @Override
    public List<RouteViewRevealHandler> getRevealHandlers() {
        return routeLayout.getRevealHandlers();
    }

    @Override
    public S setRevealHandlers(List<RouteViewRevealHandler> revealHandlers) {
        this.routeLayout.setRevealHandlers(revealHandlers);
        return self();
    }

    @Override
    public S addRevealHandler(RouteViewRevealHandler revealHandler) {
        this.routeLayout.addRevealHandler(revealHandler);
        return self();
    }

    @Override
    public S setRevealHandler(RouteViewRevealHandler revealHandler) {
        routeLayout.setRevealHandler(revealHandler);
        return self();
    }

    @Override
    public S removeRevealHandler(RouteViewRevealHandler revealHandler) {
        routeLayout.removeRevealHandler(revealHandler);
        return self();
    }

    @Override
    public List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers() {
        return routeLayout.getBeforeRevealHandlers();
    }

    @Override
    public S setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        this.routeLayout.setBeforeRevealHandlers(beforeRevealHandlers);
        return self();
    }

    @Override
    public S addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        this.routeLayout.addBeforeRevealHandler(beforeRevealHandler);
        return self();
    }

    @Override
    public S setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        routeLayout.setBeforeRevealHandler(beforeRevealHandler);
        return self();
    }

    @Override
    public S removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        routeLayout.removeBeforeRevealHandler(beforeRevealHandler);
        return self();
    }

    @Override
    public WebView getCurrentView() {
        return routeLayout.getCurrentView();
    }

    @Override
    public S setCurrentView(WebView currentView) {
        this.routeLayout.setCurrentView(currentView);
        return self();
    }

    public boolean isCurrentView(WebView view) {
        return routeLayout.isCurrentView(view);
    }

    public Collection<WebView> getViews() {
        return routeLayout.getViews();
    }

    public void reveal(String url) {
        routeLayout.reveal(url);
    }

    public void reveal(String url, boolean updateUrl) {
        routeLayout.reveal(url, updateUrl);
    }

    public void reveal(String url, Collection<RouteViewRevealHandler> handler) {
        routeLayout.reveal(url, handler);
    }

    public void reveal(WebView route, Collection<RouteViewRevealHandler> handler) {
        routeLayout.reveal(route, handler);
    }

    public void reveal(WebView route, boolean reveal) {
        routeLayout.reveal(route, reveal);
    }

    public void reveal(WebView route, boolean reveal, boolean forceCreate) {
        routeLayout.reveal(route, reveal, forceCreate);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
    }

    protected abstract S self();
}