package dev.reuise.web.core.carousel;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.carousel.DefaultCoreCarouselPart;
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
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.web.core.text.WebInlineText;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleProperty;
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
public abstract class DefaultWebCarouselPart<S extends DefaultWebCarouselPart<S, O>, O extends WebCarouselPartOptions> extends DefaultCoreCarouselPart<S, O> implements WebCarousel , WebComponentPart {
    @Override
    public S setActiveIndex(Integer activeIndex) {
        requireMinimum(activeIndex, 0, "ActiveIndex");
        super.setActiveIndex(activeIndex);
        setData("activeindex", activeIndex.toString());
        return self();
    }

    @Override
    public S setGroupSize(Integer groupSize) {
        if (groupSize != null)
            requireMinimum(groupSize, 1, "GroupSize");

        super.setGroupSize(groupSize);
        if (groupSize == null)
            removeAttribute("data-groupsize");
        else
            setData("groupsize", groupSize.toString());

        return self();
    }

    @Override
    public S setAlign(String align) {
        if (((!"start".equals(align)) && (!"center".equals(align))) && (!"end".equals(align)))
            throw new IllegalArgumentException("Align must be start, center or end");

        super.setAlign(align);
        setData("align", align);
        return self();
    }

    @Override
    public S setWhitespace(Boolean whitespace) {
        super.setWhitespace(Boolean.TRUE.equals(whitespace));
        setData("whitespace", Boolean.toString(isWhitespace()));
        return self();
    }

    @Override
    public S setCircular(Boolean circular) {
        super.setCircular(Boolean.TRUE.equals(circular));
        setData("circular", Boolean.toString(isCircular()));
        return self();
    }

    @Override
    public S setDraggable(Boolean draggable) {
        super.setDraggable(Boolean.TRUE.equals(draggable));
        setData("draggable", Boolean.toString(isDraggable()));
        return self();
    }

    @Override
    public S setAutoplay(Boolean autoplay) {
        super.setAutoplay(Boolean.TRUE.equals(autoplay));
        setData("autoplay", Boolean.toString(isAutoplay()));
        return self();
    }

    @Override
    public S setAutoplayInterval(Integer autoplayInterval) {
        requireMinimum(autoplayInterval, 1, "AutoplayInterval");
        super.setAutoplayInterval(autoplayInterval);
        setData("autoplayinterval", autoplayInterval.toString());
        return self();
    }

    @Override
    public S setPaused(Boolean paused) {
        super.setPaused(Boolean.TRUE.equals(paused));
        setData("paused", Boolean.toString(isPaused()));
        return self();
    }

    @Override
    public S setTransitionMillis(Integer transitionMillis) {
        requireMinimum(transitionMillis, 0, "TransitionMillis");
        super.setTransitionMillis(transitionMillis);
        setData("transitionmillis", transitionMillis.toString());
        return self();
    }

    @Override
    public S setShowNavigation(Boolean showNavigation) {
        super.setShowNavigation(Boolean.TRUE.equals(showNavigation));
        setData("shownavigation", Boolean.toString(isShowNavigation()));
        return self();
    }

    @Override
    public S setShowIndicators(Boolean showIndicators) {
        super.setShowIndicators(Boolean.TRUE.equals(showIndicators));
        setData("showindicators", Boolean.toString(isShowIndicators()));
        return self();
    }

    @Override
    public S setGap(Integer gap) {
        requireMinimum(gap, 0, "Gap");
        super.setGap(gap);
        setData("gap", gap.toString());
        StyleOptions inputs = new StyleOptions();
        inputs.setProperty(new StyleProperty("--reuise-carousel-gap"), gap + "px", false);
        getStyle().append(inputs);
        return self();
    }

    @Override
    public S setLabel(String label) {
        requireLabel(label);
        super.setLabel(label);
        setData("label", label);
        setAttribute("aria-label", label);
        return self();
    }

    @Override
    public S setPreviousLabel(String previousLabel) {
        requireLabel(previousLabel);
        super.setPreviousLabel(previousLabel);
        setData("previouslabel", previousLabel);
        if (getPreviousButton() != null)
            getPreviousButton().setLabel(previousLabel);

        return self();
    }

    @Override
    public S setNextLabel(String nextLabel) {
        requireLabel(nextLabel);
        super.setNextLabel(nextLabel);
        setData("nextlabel", nextLabel);
        if (getNextButton() != null)
            getNextButton().setLabel(nextLabel);

        return self();
    }

    @Override
    public S setPlayLabel(String playLabel) {
        requireLabel(playLabel);
        super.setPlayLabel(playLabel);
        setData("playlabel", playLabel);
        return self();
    }

    @Override
    public S setPauseLabel(String pauseLabel) {
        requireLabel(pauseLabel);
        super.setPauseLabel(pauseLabel);
        setData("pauselabel", pauseLabel);
        return self();
    }

    @Override
    public S setPageLabel(String pageLabel) {
        requireLabel(pageLabel);
        super.setPageLabel(pageLabel);
        setData("pagelabel", pageLabel);
        return self();
    }

    private void requireLabel(String value) {
        if ((value == null) || value.trim().isEmpty())
            throw new IllegalArgumentException("Carousel labels must not be empty");

    }

    private void requireMinimum(Integer value, int minimum, String name) {
        if ((value == null) || (value < minimum))
            throw new IllegalArgumentException((name + " must be at least ") + minimum);

    }

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebCarouselPart(O options) {
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
        if (viewport != null)
            viewport.setRootComponent(rootComponent);

        if (slider != null)
            slider.setRootComponent(rootComponent);

        if (navigation != null)
            navigation.setRootComponent(rootComponent);

        if (previousButton != null)
            previousButton.setRootComponent(rootComponent);

        if (indicators != null)
            indicators.setRootComponent(rootComponent);

        if (nextButton != null)
            nextButton.setRootComponent(rootComponent);

        if (autoplayButton != null)
            autoplayButton.setRootComponent(rootComponent);

        if (announcement != null)
            announcement.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return containerPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (viewport != null)
            viewport.setTheme(theme);

        if (slider != null)
            slider.setTheme(theme);

        if (navigation != null)
            navigation.setTheme(theme);

        if (previousButton != null)
            previousButton.setTheme(theme);

        if (indicators != null)
            indicators.setTheme(theme);

        if (nextButton != null)
            nextButton.setTheme(theme);

        if (autoplayButton != null)
            autoplayButton.setTheme(theme);

        if (announcement != null)
            announcement.setTheme(theme);

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
    public WebCarousel getComponent() {
        return ((WebCarousel) (baseComponentPart.getComponent()));
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
        setAttribute("role", "region");
        setAttribute("aria-roledescription", "carousel");
        getViewport().setAttribute("tabindex", "0");
        if (getViewport().getId() == null)
            getViewport().setId(getViewport().getUniqueId());

        getPreviousButton().setAttribute("type", "button");
        getNextButton().setAttribute("type", "button");
        getAutoplayButton().setAttribute("type", "button");
        getPreviousButton().setAttribute("aria-controls", getViewport().getId());
        getNextButton().setAttribute("aria-controls", getViewport().getId());
        getAnnouncement().setAttribute("aria-live", "polite");
        getAnnouncement().setAttribute("aria-atomic", "true");
        setLabel(options.getLabel());
        setPreviousLabel(options.getPreviousLabel());
        setNextLabel(options.getNextLabel());
        setPlayLabel(options.getPlayLabel());
        setPauseLabel(options.getPauseLabel());
        setPageLabel(options.getPageLabel());
        setActiveIndex(options.getActiveIndex());
        setGroupSize(options.getGroupSize());
        setAlign(options.getAlign());
        setWhitespace(options.isWhitespace());
        setCircular(options.isCircular());
        setDraggable(options.isDraggable());
        setAutoplay(options.isAutoplay());
        setAutoplayInterval(options.getAutoplayInterval());
        setPaused(options.isPaused());
        setTransitionMillis(options.getTransitionMillis());
        setShowNavigation(options.isShowNavigation());
        setShowIndicators(options.isShowIndicators());
        setGap(options.getGap());
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
    public WebContainer getViewport() {
        return ((WebContainer) (super.getViewport()));
    }

    @Override
    public WebContainer getSlider() {
        return ((WebContainer) (super.getSlider()));
    }

    @Override
    public WebContainer getNavigation() {
        return ((WebContainer) (super.getNavigation()));
    }

    @Override
    public WebButton getPreviousButton() {
        return ((WebButton) (super.getPreviousButton()));
    }

    @Override
    public WebContainer getIndicators() {
        return ((WebContainer) (super.getIndicators()));
    }

    @Override
    public WebButton getNextButton() {
        return ((WebButton) (super.getNextButton()));
    }

    @Override
    public WebButton getAutoplayButton() {
        return ((WebButton) (super.getAutoplayButton()));
    }

    @Override
    public WebInlineText getAnnouncement() {
        return ((WebInlineText) (super.getAnnouncement()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-carousel").setPosition("relative").setMinWidth("0");
        commonStyles.addRule(".reuise-carousel_viewport").setOverflow("auto").setMaxWidth("100%");
        commonStyles.addRule(".reuise-carousel[data-carousel-ready]>.reuise-carousel_viewport").setOverflow("hidden");
        commonStyles.addRule(".reuise-carousel_slider").setDisplay("flex").setAlignItems("stretch").setRowGap("var(--reuise-carousel-gap, 16px)").setColumnGap("var(--reuise-carousel-gap, 16px)");
        commonStyles.addRule(":where(.reuise-carousel_slider>.reuise-carouselcard)").setFlex("0 0 100%").setMinWidth("0").setMaxWidth("100%").setBoxSizing("border-box");
        commonStyles.addRule(":where(.reuise-carousel_slider>.reuise-carouselcard[data-autosize=\"true\"])").setFlex("0 0 auto").setWidth("max-content");
        commonStyles.addRule(".reuise-carousel_navigation,.reuise-carousel_indicators").setDisplay("flex").setAlignItems("center").setJustifyContent("center").setRowGap("8px").setColumnGap("8px");
        commonStyles.addRule(".reuise-carousel_navigation").setPaddingTop("12px");
        commonStyles.addRule(".reuise-carousel:not([data-carousel-ready])>.reuise-carousel_navigation").setDisplay("none");
        commonStyles.addRule(((".reuise-carousel[data-shownavigation=\"false\"] .reuise-carousel_previousbutton," + ".reuise-carousel[data-shownavigation=\"false\"] .reuise-carousel_nextbutton,") + ".reuise-carousel[data-showindicators=\"false\"] .reuise-carousel_indicators,") + ".reuise-carousel:not([data-autoplay=\"true\"]) .reuise-carousel_autoplaybutton").setDisplay("none");
        commonStyles.addRule(".reuise-carousel_indicator").setWidth("10px").setHeight("10px").setPadding("0").setBorder("1px solid currentColor").setBorderRadius("50%").setBackgroundColor("transparent").setCursor("pointer");
        commonStyles.addRule(".reuise-carousel_indicator[aria-current=\"true\"]").setBackgroundColor("currentColor");
        commonStyles.addRule(".reuise-carousel_announcement").setPosition("absolute").setWidth("1px").setHeight("1px").setOverflow("hidden").setClipPath("inset(50%)").setWhiteSpace("nowrap");
    }
}
