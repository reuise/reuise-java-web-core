package dev.reuise.web.core.floating;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.floating.DefaultCoreFloatingPanelPart;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Animation - WEB
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
// Option: LocaleContext - CORE
// Option: LinkUrlResolver - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: container
// add composition for container: startAnimation
// add composition for container: cancelAnimation
// add composition for container: addMarkdown
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
public abstract class DefaultWebFloatingPanelPart<S extends DefaultWebFloatingPanelPart<S, O>, O extends WebFloatingPanelPartOptions> extends DefaultCoreFloatingPanelPart<S, O> implements WebComponentPart , WebFloatingPanel {
    @Override
    public S setTitle(String title) {
        super.setTitle(FloatingPresentation.label(title));
        setData("title", getTitle());
        if (getTitleContainer() != null)
            getTitleContainer().setText(getTitle());

        return self();
    }

    @Override
    public S setCloseLabel(String closeLabel) {
        super.setCloseLabel((closeLabel == null) || closeLabel.trim().isEmpty() ? "Close" : closeLabel);
        setData("closelabel", getCloseLabel());
        if (getCloseButton() != null) {
            getCloseButton().setLabel(getCloseLabel());
            getCloseButton().setAttribute("aria-label", getCloseLabel());
        }
        return self();
    }

    @Override
    public S setMinimiseLabel(String minimiseLabel) {
        super.setMinimiseLabel((minimiseLabel == null) || minimiseLabel.trim().isEmpty() ? "Minimise" : minimiseLabel);
        setData("minimiselabel", getMinimiseLabel());
        if (getMinimiseButton() != null) {
            getMinimiseButton().setLabel(getMinimiseLabel());
            getMinimiseButton().setAttribute("aria-label", getMinimiseLabel());
        }
        return self();
    }

    @Override
    public S setExpanded(Boolean expanded) {
        super.setExpanded(Boolean.TRUE.equals(expanded));
        if (isExpanded()) {
            super.setMinimised(false);
            setData("minimised", "false");
        }
        setData("expanded", Boolean.toString(isExpanded()));
        if (getTrigger() != null)
            getTrigger().setAttribute("aria-expanded", Boolean.toString(isExpanded()));

        if (getPanel() != null) {
            if (isExpanded())
                getPanel().removeAttribute("hidden");
            else
                getPanel().setAttribute("hidden", "");

        }
        return self();
    }

    @Override
    public S setMinimised(Boolean minimised) {
        super.setMinimised(Boolean.TRUE.equals(minimised));
        setData("minimised", Boolean.toString(isMinimised()));
        if (isMinimised())
            setExpanded(false);

        return self();
    }

    @Override
    public S setDocked(Boolean docked) {
        super.setDocked(Boolean.TRUE.equals(docked));
        setData("docked", Boolean.toString(isDocked()));
        return self();
    }

    @Override
    public S setCorner(String corner) {
        super.setCorner(FloatingPresentation.corner(corner));
        setData("corner", getCorner());
        if (getTrigger() != null)
            getTrigger().setCorner(getCorner());

        return self();
    }

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebFloatingPanelPart(O options) {
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
    public ComponentAnimation getAnimation() {
        return containerPart.getAnimation();
    }

    @Override
    public S setAnimation(ComponentAnimation animation) {
        this.containerPart.setAnimation(animation);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S startAnimation() {
        containerPart.startAnimation();
        return self();
    }

    public S cancelAnimation() {
        containerPart.cancelAnimation();
        return self();
    }

    public S addMarkdown(String markdown) {
        containerPart.addMarkdown(markdown);
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
        if (trigger != null)
            trigger.setRootComponent(rootComponent);

        if (panel != null)
            panel.setRootComponent(rootComponent);

        if (header != null)
            header.setRootComponent(rootComponent);

        if (titleContainer != null)
            titleContainer.setRootComponent(rootComponent);

        if (minimiseButton != null)
            minimiseButton.setRootComponent(rootComponent);

        if (closeButton != null)
            closeButton.setRootComponent(rootComponent);

        if (content != null)
            content.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return containerPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (trigger != null)
            trigger.setTheme(theme);

        if (panel != null)
            panel.setTheme(theme);

        if (header != null)
            header.setTheme(theme);

        if (titleContainer != null)
            titleContainer.setTheme(theme);

        if (minimiseButton != null)
            minimiseButton.setTheme(theme);

        if (closeButton != null)
            closeButton.setTheme(theme);

        if (content != null)
            content.setTheme(theme);

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
    public S clearStyleClasses() {
        baseComponentPart.clearStyleClasses();
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
    public WebFloatingPanel getComponent() {
        return ((WebFloatingPanel) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        setupReferences();
        return true;
    }

    // Implementation
    // Implementation
    // Implementation
    public void onInitialize(O options) {
        super.onInitialize(options);
        if ((getPanel().getId() == null) || getPanel().getId().isEmpty())
            getPanel().setId(getPanel().getUniqueId());

        if ((getTitleContainer().getId() == null) || getTitleContainer().getId().isEmpty())
            getTitleContainer().setId(getTitleContainer().getUniqueId());

        getPanel().setAttribute("role", "dialog");
        getPanel().setAttribute("aria-modal", "false");
        getPanel().setAttribute("aria-labelledby", getTitleContainer().getId());
        getPanel().setAttribute("tabindex", "-1");
        getTrigger().setAttribute("aria-controls", getPanel().getId());
        getTrigger().setAttribute("aria-haspopup", "dialog");
        getCloseButton().setAttribute("type", "button");
        getMinimiseButton().setAttribute("type", "button");
        setTitle(options.getTitle());
        setCloseLabel(options.getCloseLabel());
        setMinimiseLabel(options.getMinimiseLabel());
        setCorner(options.getCorner());
        setDocked(options.isDocked());
        setExpanded(options.isExpanded());
        if (!isExpanded())
            setMinimised(options.isMinimised());

    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        containerPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebFloatingActionButton getTrigger() {
        return ((WebFloatingActionButton) (super.getTrigger()));
    }

    @Override
    public WebContainer getPanel() {
        return ((WebContainer) (super.getPanel()));
    }

    @Override
    public WebContainer getHeader() {
        return ((WebContainer) (super.getHeader()));
    }

    @Override
    public WebInlineText getTitleContainer() {
        return ((WebInlineText) (super.getTitleContainer()));
    }

    @Override
    public WebButton getMinimiseButton() {
        return ((WebButton) (super.getMinimiseButton()));
    }

    @Override
    public WebButton getCloseButton() {
        return ((WebButton) (super.getCloseButton()));
    }

    @Override
    public WebContainer getContent() {
        return ((WebContainer) (super.getContent()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        FloatingStyles.initialize(commonStyles);
    }
}
