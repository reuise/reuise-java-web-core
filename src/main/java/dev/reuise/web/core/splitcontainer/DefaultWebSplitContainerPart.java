package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanel;
import dev.reuise.core.splitcontainer.DefaultCoreSplitContainerPart;
import dev.reuise.core.splitcontainer.SplitDirection;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public abstract class DefaultWebSplitContainerPart<S extends DefaultWebSplitContainerPart<S, O>, O extends WebSplitContainerPartOptions> extends DefaultCoreSplitContainerPart<S, O> implements WebSplitContainer , WebComponentPart {
    public void updatePanelSizes(State state) {
        WebSplitContainerPanel webStartPanel = ((WebSplitContainerPanel) (this.startPanel));
        WebSplitContainerDivider webDivider = ((WebSplitContainerDivider) (this.divider));
        SplitDirection direction = getDirection(state);
        if (direction == null)
            return;

        setPanelSize(this.startPanel, direction, state);
        setPanelSize(this.endPanel, direction, state);
        Style dividerStateStyle = null;
        if (webDivider != null) {
            dividerStateStyle = webDivider.getStyle(state);
            if (dividerStateStyle != null) {
                Object startPanelSize = webStartPanel.getSize(state);
                if (getDirection(state) == SplitDirection.VERTICAL) {
                    dividerStateStyle.setLeft(startPanelSize);
                } else if (getDirection(state) == SplitDirection.HORIZONTAL) {
                    dividerStateStyle.setTop(startPanelSize);
                }
            }
        }
    }

    @Override
    public S setDirection(SplitDirection direction) {
        return setDirection(direction, null);
    }

    @Override
    public S setDirection(SplitDirection direction, State state) {
        super.setDirection(direction, state);
        setPanelSize(this.startPanel, direction, null);
        setPanelSize(this.endPanel, direction, null);
        setDirectionInternal(direction, state);
        if (this.divider != null) {
            WebSplitContainerDivider webDivider = ((WebSplitContainerDivider) (this.divider));
            Style dividerStyle = webDivider.getStyle(state);
            if (dividerStyle == null)
                return self();

            if (direction == SplitDirection.VERTICAL) {
                dividerStyle.setTop("0");
                dividerStyle.setBottom("0");
                dividerStyle.setWidth(this.divider.getThickness(state));
                dividerStyle.setHeight("100%");
                dividerStyle.setCursor("col-resize");
            } else if (direction == SplitDirection.HORIZONTAL) {
                dividerStyle.setLeft("0");
                dividerStyle.setRight("0");
                dividerStyle.setWidth("100%");
                dividerStyle.setHeight(this.divider.getThickness(state));
                dividerStyle.setCursor("row-resize");
            }
        }
        return self();
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection, State state) {
        super.setReverseDirection(reverseDirection, state);
        setDirectionInternal(getDirection(state), state);
        return self();
    }

    private void setDirectionInternal(SplitDirection direction, State state) {
        if (direction == null)
            return;

        if (isRehydrated())
            return;

        WebContainer webContainer = ((WebContainer) (this.container));
        Style style = webContainer.getStyle(state);
        if (style != null)
            style.setFlexDirection((direction == SplitDirection.VERTICAL ? "row" : "column") + (isReverseDirection(state) ? "-reverse" : ""), true);

        addStyleClass(("reuise-splitcontainer--" + direction.getShortName()) + (state == null ? "" : "_" + state.getStateKey()));
    }

    private void setPanelSize(CoreSplitContainerPanel panel, SplitDirection direction, State state) {
        // WebSplitContainerPanel webPanel = (WebSplitContainerPanel) panel;
        // Style style = webPanel.getStyle(state);
        Object size = panel.getSize(state);
        if (size != null) {
            panel.setSize(size, state);
            /* if(direction == SplitDirection.VERTICAL) style.setWidth(Style.parseProperty(size));
            else if(direction == SplitDirection.HORIZONTAL) style.setHeight(Style.parseProperty(size));
             */
        }
        Object minSize = panel.getMinSize(state);
        if (minSize != null) {
            panel.setMinSize(minSize, state);
            /* if(direction == SplitDirection.VERTICAL) style.setMinWidth(Style.parseProperty(minSize));
            else if(direction == SplitDirection.HORIZONTAL) style.setMinHeight(Style.parseProperty(minSize));
             */
        }
        Object maxSize = panel.getMaxSize(state);
        if (maxSize != null) {
            panel.setMaxSize(maxSize, state);
            /* if(direction == SplitDirection.VERTICAL) style.setMaxWidth(Style.parseProperty(maxSize), true);
            else if(direction == SplitDirection.HORIZONTAL) style.setMaxHeight(Style.parseProperty(maxSize), true);
             */
        }
    }

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebSplitContainerPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        containerPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        containerPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        containerPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        containerPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        containerPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        containerPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        containerPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        containerPart.addParagraph(html);
        return self();
    }

    @Override
    public RootComponent getRootComponent() {
        return containerPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.containerPart.setRootComponent(rootComponent);
        if (container != null)
            container.setRootComponent(rootComponent);

        if (startPanel != null)
            startPanel.setRootComponent(rootComponent);

        if (divider != null)
            divider.setRootComponent(rootComponent);

        if (endPanel != null)
            endPanel.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return containerPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (container != null)
            container.setTheme(theme);

        if (startPanel != null)
            startPanel.setTheme(theme);

        if (divider != null)
            divider.setTheme(theme);

        if (endPanel != null)
            endPanel.setTheme(theme);

        this.containerPart.setTheme(theme);
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
        if (containerPart == null)
            return false;

        return containerPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return containerPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        containerPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return containerPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        containerPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        containerPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        containerPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        containerPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return containerPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return containerPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        containerPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return containerPart.getData(data);
    }

    public boolean hasData(String data) {
        return containerPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        containerPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return containerPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return containerPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return containerPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return containerPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return containerPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return containerPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return containerPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        containerPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return containerPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return containerPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return containerPart.hasWrapper();
    }

    public boolean isInitialized() {
        return containerPart.isInitialized();
    }

    public void log(Object obj) {
        containerPart.log(obj);
    }

    public void removeFromParent() {
        containerPart.removeFromParent();
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
        setupReferences();
        baseComponentPart.initialize(component, options);
    }

    @Override
    public WebSplitContainer getComponent() {
        return ((WebSplitContainer) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        setupReferences();
        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    // Implementation
    // Implementation
    public void onCreate(O options) {
        super.onCreate(options);
        // if(Boolean.TRUE.equals(isResizable())) {
        WebSplitContainerPanel webStartPanel = ((WebSplitContainerPanel) (this.startPanel));
        // Style startPanelStyle = webStartPanel.getStyle();
        WebSplitContainerDivider webDivider = ((WebSplitContainerDivider) (this.divider));
        // Style dividerStyle = webDivider.getStyle();
        /* if(getDirection() == SplitDirection.VERTICAL) {
        startPanelStyle.setWidth(options.getStartPanelOptions().getSize());
        dividerStyle.setLeft(options.getStartPanelOptions().getSize());
        }
        else if(getDirection() == SplitDirection.HORIZONTAL) {
        startPanelStyle.setHeight(options.getStartPanelOptions().getSize());
        dividerStyle.setTop(options.getStartPanelOptions().getSize());
        }
         */
        for (State state : options.getStartPanelOptions().getSizeStates()) {
            updatePanelSizes(state);
        }
        // }
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        containerPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebContainer getContainer() {
        return ((WebContainer) (super.getContainer()));
    }

    @Override
    public WebSplitContainerPanel getStartPanel() {
        return ((WebSplitContainerPanel) (super.getStartPanel()));
    }

    @Override
    public WebSplitContainerDivider getDivider() {
        return ((WebSplitContainerDivider) (super.getDivider()));
    }

    @Override
    public WebSplitContainerPanel getEndPanel() {
        return ((WebSplitContainerPanel) (super.getEndPanel()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-splitcontainer").setWidth("100%").setHeight("100%");
        commonStyles.addRule(".reuise-splitcontainer_container").setPosition("relative").setDisplay("flex").setWidth("inherit").setHeight("inherit");
        commonStyles.addRule(".reuise-splitcontainer_panel").setOverflow("hidden auto");
        commonStyles.addRule(".reuise-splitcontainer_startpanel").setFlex("0 0 auto");
        commonStyles.addRule(".reuise-splitcontainer_endpanel").setFlex("1 1 content");
        commonStyles.addRule(".reuise-splitcontainer_divider").setPosition("absolute").setTransition("background-color 50ms ease-in 0s").setDisplay("none").setZIndex(9999);
        commonStyles.addRule(".reuise-splitcontainer_divider:hover").setTransitionDelay("300ms", true);
        commonStyles.addRule(".reuise-splitcontainer_panel--collapsed").setPosition("absolute", true).setHeight("100vh").setZIndex(99999).setRight("100vw");
        commonStyles.addRule(".reuise-splitcontainer--horizontal>.reuise-splitcontainer_container").setFlexDirection("column");
        commonStyles.addRule(".reuise-splitcontainer--vertical>.reuise-splitcontainer_container").setFlexDirection("row");
        for (ScreenSize s : ScreenSize.values()) {
            commonStyles.addRule(".reuise-splitcontainer_panel--collapsed_" + s.getStateKey(), s).setPosition("absolute", true).setHeight("100vh").setZIndex(99999).setRight("100vw");
            commonStyles.addRule(".reuise-splitcontainer--horizontal>.reuise-splitcontainer_container" + s.getStateKey(), s).setFlexDirection("column");
            commonStyles.addRule(".reuise-splitcontainer--vertical>.reuise-splitcontainer_container" + s.getStateKey(), s).setFlexDirection("row");
        }
    }

    @Override
    public S setDirectionAllStates(SplitDirection direction) {
        setDirection(ScreenSizeValues.of(direction, direction));
        setDirection(direction);
        return self();
    }

    @Override
    public S setReverseDirectionAllStates(Boolean reverseDirection) {
        setReverseDirection(ScreenSizeValues.of(reverseDirection, reverseDirection));
        setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setSplitPositionAllStates(Object splitPosition) {
        setSplitPosition(ScreenSizeValues.of(splitPosition, splitPosition));
        setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setMinSplitPositionAllStates(Object minSplitPosition) {
        setMinSplitPosition(ScreenSizeValues.of(minSplitPosition, minSplitPosition));
        setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPositionAllStates(Object maxSplitPosition) {
        setMaxSplitPosition(ScreenSizeValues.of(maxSplitPosition, maxSplitPosition));
        setMaxSplitPosition(maxSplitPosition);
        return self();
    }
}