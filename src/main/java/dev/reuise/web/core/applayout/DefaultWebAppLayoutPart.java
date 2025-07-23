package dev.reuise.web.core.applayout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.applayout.DefaultCoreAppLayoutPart;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.core.drawer.CoreDrawer;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanel;
import dev.reuise.core.theme.Theme;
import dev.reuise.core.topappbar.CoreTopAppBar;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainer;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanel;
import dev.reuise.web.core.topappbar.WebTopAppBar;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public abstract class DefaultWebAppLayoutPart<S extends DefaultWebAppLayoutPart<S, O>, O extends WebAppLayoutPartOptions> extends DefaultCoreAppLayoutPart<S, O> implements WebAppLayout , WebComponentPart {
    private CoreParentComponentPart contentPanel;

    @Override
    public S setDrawer(CoreDrawer drawer) {
        super.setDrawer(drawer);
        if (isRehydrated() || (drawer == null))
            return self();

        /* CoreSplitContainerOptions splitOpts = getComponentFactory().createSplitContainerOptions();
        splitOpts.setDirection(SplitDirection.VERTICAL);
        splitOpts.setResizable(drawer.isResizable());

        WebSplitContainer split = addSplitContainer(splitOpts);
        WebSplitContainerPanel startPanel = split.getStartPanel();
        startPanel.setCollapsed(true, ScreenSize.EXTRA_SMALL);
        startPanel.setCollapsed(true, ScreenSize.SMALL);
        startPanel.add(drawer);
         */
        return self();
    }

    @Override
    public S setTopAppBar(CoreTopAppBar topAppBar) {
        super.setTopAppBar(topAppBar);
        if (isRehydrated() || (topAppBar == null))
            return self();

        /* CoreSplitContainerOptions splitOpts = getComponentFactory().createSplitContainerOptions();
        splitOpts.setDirection(SplitDirection.HORIZONTAL);

        WebSplitContainerPanelOptions startPanelOpts = getComponentFactory().createSplitContainerPanelOptions();
        startPanelOpts.setMinSize("auto");
        splitOpts.setStartPanelOptions(startPanelOpts);

        WebSplitContainer split = addSplitContainer(splitOpts);
        split.getStartPanel().add(topAppBar);
         */
        WebAppLayoutBody body = ((WebAppLayoutBody) (this.body));
        // if (topAppBar != null && body != null) {
        // getParentComponentPart().insertBefore(topAppBar, body);
        WebTopAppBar webtopAppBar = ((WebTopAppBar) (topAppBar));
        if (Boolean.TRUE.equals(topAppBar.isFixed())) {
            webtopAppBar.getStyleStates().stream().forEach(s -> {
                Object height = webtopAppBar.getHeight(s);
                if (height != null) {
                    // body.getStyle(s).setMarginTop(height);
                    if (this.topAppBarSplit != null) {
                        CoreSplitContainerPanel startPanel = this.topAppBarSplit.getStartPanel();
                        startPanel.setSize(height, s);
                        startPanel.setMinSize(height, s);
                        startPanel.setMaxSize(height, s);
                    }
                }
            });
        }
        // }
        return self();
    }

    @Override
    public S setBottomAppBar(CoreBottomAppBar bottomAppBar) {
        super.setBottomAppBar(bottomAppBar);
        if (isRehydrated())
            return self();

        if (bottomAppBar != null) {
            getParentComponentPart().add(bottomAppBar);
        }
        return self();
    }

    /* private WebSplitContainer addSplitContainer(CoreSplitContainerOptions splitOpts) {
    WebSplitContainer split = getComponentFactory().createSplitContainer(splitOpts);

    contentPanel.remove(body);
    contentPanel.add(split);

    contentPanel = split.getEndPanel();

    body.setDirection(splitOpts.getDirection() == SplitDirection.VERTICAL ? FlexDirection.ROW : FlexDirection.COLUMN);
    contentPanel.add(body);

    return split;
    }
     */
    @Override
    public void openDrawer() {
        super.openDrawer();
        addStyleClass(getBaseStyleClass() + "--draweropened");
    }

    @Override
    public void closeDrawer() {
        super.closeDrawer();
        removeStyleClass(getBaseStyleClass() + "--draweropened");
    }

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebAppLayoutPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public RootComponent getRootComponent() {
        return parentComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.parentComponentPart.setRootComponent(rootComponent);
        if (drawerScrim != null)
            drawerScrim.setRootComponent(rootComponent);

        if (drawerSplit != null)
            drawerSplit.setRootComponent(rootComponent);

        if (topAppBarSplit != null)
            topAppBarSplit.setRootComponent(rootComponent);

        if (body != null)
            body.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return parentComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (drawerScrim != null)
            drawerScrim.setTheme(theme);

        if (drawerSplit != null)
            drawerSplit.setTheme(theme);

        if (topAppBarSplit != null)
            topAppBarSplit.setTheme(theme);

        if (body != null)
            body.setTheme(theme);

        this.parentComponentPart.setTheme(theme);
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
        if (parentComponentPart == null)
            return false;

        return parentComponentPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return parentComponentPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        parentComponentPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return parentComponentPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        parentComponentPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        parentComponentPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        parentComponentPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        parentComponentPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return parentComponentPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return parentComponentPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        parentComponentPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return parentComponentPart.getData(data);
    }

    public boolean hasData(String data) {
        return parentComponentPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        parentComponentPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return parentComponentPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return parentComponentPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return parentComponentPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return parentComponentPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return parentComponentPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return parentComponentPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return parentComponentPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        parentComponentPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return parentComponentPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return parentComponentPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return parentComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return parentComponentPart.isInitialized();
    }

    public void log(Object obj) {
        parentComponentPart.log(obj);
    }

    public void removeFromParent() {
        parentComponentPart.removeFromParent();
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
    public WebAppLayout getComponent() {
        return ((WebAppLayout) (baseComponentPart.getComponent()));
    }

    // Implementation
    // Implementation
    // Implementation
    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        contentPanel = getParentComponentPart();
        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    // Implementation
    // Implementation
    public void onCreate(O options) {
        super.onCreate(options);
        if (!isRehydrated()) {
            if ((this.drawer != null) && (this.drawerSplit != null)) {
                this.drawerSplit.getStartPanel().add(this.drawer);
                WebSplitContainer split = ((WebSplitContainer) (this.drawerSplit));
                WebSplitContainerPanel startPanel = split.getStartPanel();
                startPanel.setCollapsed(true, ScreenSize.EXTRA_SMALL);
                startPanel.setCollapsed(true, ScreenSize.SMALL);
                this.body.removeFromParent();
                this.drawerSplit.add(this.body);
            }
            if ((this.topAppBar != null) && (this.topAppBarSplit != null)) {
                WebSplitContainer split = ((WebSplitContainer) (this.topAppBarSplit));
                WebTopAppBar webtopAppBar = ((WebTopAppBar) (this.topAppBar));
                WebSplitContainerPanel startPanel = split.getStartPanel();
                WebAppLayoutBody body = ((WebAppLayoutBody) (this.body));
                if (Boolean.TRUE.equals(this.topAppBar.isFixed())) {
                    webtopAppBar.getStyleStates().stream().forEach(s -> {
                        Object height = webtopAppBar.getHeight(s);
                        if (height != null) {
                            // body.getStyle(s).setMarginTop(height);
                            if (this.topAppBarSplit != null) {
                                this.topAppBarSplit.getStartPanel().setSize(height, s);
                                startPanel.setMinSize(height, s);
                            }
                        }
                    });
                }
                this.topAppBarSplit.getStartPanel().add(this.topAppBar);
                body.removeFromParent();
                this.topAppBarSplit.add(body);
            }
        }
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebContainer getDrawerScrim() {
        return ((WebContainer) (super.getDrawerScrim()));
    }

    @Override
    public WebSplitContainer getDrawerSplit() {
        return ((WebSplitContainer) (super.getDrawerSplit()));
    }

    @Override
    public WebSplitContainer getTopAppBarSplit() {
        return ((WebSplitContainer) (super.getTopAppBarSplit()));
    }

    @Override
    public WebAppLayoutBody getBody() {
        return ((WebAppLayoutBody) (super.getBody()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-app-layout_body").setDisplay("flex");
        commonStyles.addRule(".reuise-drawer").setHeight("100vh").setTop(0).setTransitionProperty("none").setBoxShadow("1px 0px 8px rgba(0, 0, 0, 0.24)");
        for (ScreenSize s : ScreenSize.values()) {
            commonStyles.addRule((".reuise-app-layout .reuise-app-layout_drawersplit .reuise-splitcontainer_panel--collapsed_" + s.getStateKey()) + " .reuise-drawer", s).setTransform("translate(-100%)");
            commonStyles.addRule((((".reuise-app-layout .reuise-app-layout_drawersplit .reuise-splitcontainer_panel--collapsed_" + s.getStateKey()) + " .reuise-drawer.reuise-drawer--opened,.reuise-app-layout .reuise-app-layout_drawersplit .reuise-splitcontainer_panel--collapsed_") + s.getStateKey()) + " .reuise-drawer.reuise-drawer--closing", s).setPosition("fixed").setTransitionProperty("transform").setTransitionTimingFunction("ease-in-out").setMaxWidth(400);
            commonStyles.addRule((".reuise-app-layout .reuise-app-layout_drawersplit .reuise-splitcontainer_panel--collapsed_" + s.getStateKey()) + " .reuise-drawer.reuise-drawer--opened").setLeft(0).setZIndex(999999).setTransform("translate(0)", true);
            commonStyles.addRule((".reuise-app-layout .reuise-app-layout_drawersplit .reuise-splitcontainer_panel--collapsed_" + s.getStateKey()) + " .reuise-drawer.reuise-drawer--closing").setTransform("translate(-100%)");
        }
        commonStyles.addRule(".reuise-app-layout--draweropened .reuise-app-layout_drawerscrim").setVisibility("visible").setBackgroundColor("#2d303866");
        commonStyles.addRule(".reuise-app-layout_drawerscrim").setPosition("fixed").setZIndex(99999).setInset("0").setBackgroundColor("transparent").setVisibility("hidden").setTransitionTimingFunction("cubic-bezier(0.25, 0.8, 0.25, 1)").setTransitionDuration("400ms").setTransitionProperty("background-color,visibility");
    }
}