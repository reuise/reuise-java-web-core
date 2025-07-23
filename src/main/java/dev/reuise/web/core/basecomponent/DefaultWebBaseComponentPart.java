package dev.reuise.web.core.basecomponent;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.DefaultCoreBaseComponentPart;
import dev.reuise.core.option.AbstractComponentOptionOperation;
import dev.reuise.core.option.ApplyOperationException;
import dev.reuise.core.option.ComponentOptionOperationWithState;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
public abstract class DefaultWebBaseComponentPart<S extends DefaultWebBaseComponentPart<S, O>, O extends WebBaseComponentPartOptions> extends DefaultCoreBaseComponentPart<S, O> implements WebComponentPart , WebBaseComponent {
    protected boolean isRehydrated;

    protected StyleBuilder styles;

    protected String uniqueStyleClass;

    protected String uniqueId;

    @Override
    public WebBaseComponent getComponent() {
        return ((WebBaseComponent) (super.getComponent()));
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        if (options.isDebug())
            setDebug(true);

        super.initialize(component, options);
        boolean isPart = component != options.getComponent();
        logDebug((("Pre initialize " + (isPart ? "part" : "component")) + ": ") + component.getClass().getSimpleName());
        /* if(!isPart) {
        getParts().get(ComponentPart.Type.BASE).forEach(part -> {
        logDebugIndent(1, "Part: "+part.getClass().getSimpleName());

        CoreComponentOptions partOpts = partOptions.get(part);
        partOpts.getOptions().entrySet().forEach(entry -> {
        logDebugIndent(2, "Option: "+entry.getKey());
        });
        });
        }
         */
        if (!isPart) {
            boolean initFailed = false;
            for (ComponentPart p : getParts().get(ComponentPart.Type.BASE)) {
                if (!initializePart(((ComponentType) (p)), this.partOptions.get(p))) {
                    initFailed = true;
                    break;
                }
            }
            if (!initFailed)
                initializePart(component, options);

            clearOptions();
        }
    }

    private void logDebug(String message) {
        if (!isDebug())
            return;

        log((this.debugId + ": ") + message);
    }

    private void logDebugIndent(int indents, String message) {
        if (!isDebug())
            return;

        StringBuilder sb = new StringBuilder();
        if (indents > 0)
            IntStream.range(0, indents).forEach(i -> sb.append("\t"));

        sb.append(message);
        log(sb.toString());
    }

    private <C extends ComponentType<?, T>, T extends CoreComponentOptions> boolean initializePart(C component, T options) {
        boolean isPart = component != options.getComponent();
        logDebugIndent(isPart ? 1 : 0, (("Pre initialize " + (isPart ? "part" : "component")) + ": ") + component.getClass().getSimpleName());
        if (!component.onPreInitialize(options))
            return false;

        setupReferences();
        OptionApplicator optionApplicator = new OptionApplicator();
        logDebugIndent(isPart ? 1 : 0, (("Apply options " + (isPart ? "part" : "component")) + ": ") + component.getClass().getSimpleName());
        component.applyOptions(options, optionApplicator, options.getStates());
        optionApplicator.setOnlyForcedOptions(((WebBaseComponentPartOptions) (options)).isRehydrated());
        /* !isPart && */
        if (component.isDebug()) {
            List<AbstractComponentOptionOperation<?>> sortedOperations = optionApplicator.getSortedOperations();
            for (AbstractComponentOptionOperation<?> option : sortedOperations)
                logDebugIndent(isPart ? 2 : 1, (((option.getOption().getName() + ": ") + option.getOptionValue()) + (option.isOptionForce() ? " (forced)" : "")) + (option instanceof ComponentOptionOperationWithState ? (" (state: " + ((ComponentOptionOperationWithState<?>) (option)).getState().getStateKey()) + ")" : ""));

        }
        try {
            optionApplicator.run();
        } catch (ApplyOperationException e) {
            log((("Error applying option in " + component.getClass().getSimpleName()) + ": ") + e.getMessage());
            log(e);
            e.getOriginalException().printStackTrace();
        }
        logDebugIndent(isPart ? 1 : 0, (("Initialize " + (isPart ? "part" : "component")) + ": ") + component.getClass().getSimpleName());
        component.onInitialize(options);
        logDebugIndent(isPart ? 1 : 0, (("Create " + (isPart ? "part" : "component")) + ": ") + component.getClass().getSimpleName());
        component.onCreate(options);
        RootComponent rootComponent = options.getComponentFactory().getRootComponent();
        if (rootComponent != null)
            rootComponent.registerComponentType(component);

        return true;
    }

    @Override
    public S setRehydration(String rehydration, CoreComponent parent) {
        return setRehydration(rehydration, parent, false);
    }

    @Override
    public S setRehydration(String rehydration, CoreComponent parent, Boolean canFail) {
        if (parent != null)
            setParent(parent);

        setRequiredLayoutComponent(!canFail);
        return setRehydration(rehydration);
    }

    @Override
    public S setRehydration(String rehydration, Boolean canFail) {
        return setRehydration(rehydration, null, canFail);
    }

    @Override
    public Map<String, String> getData() {
        return null;
    }

    @Override
    public S setData(Map<String, String> data) {
        return self();
    }

    @Override
    public S setEnabled(Boolean enabled) {
        if ((enabled == null) || enabled.booleanValue())
            removeAttribute("disabled");
        else
            setAttribute("disabled", "");

        addOrRemoveStyleClass("reuise-disabled", !((enabled == null) || enabled.booleanValue()));
        return self();
    }

    @Override
    public boolean isEnabled() {
        return !hasAttribute("disabled");
    }

    @Override
    public S setContentEditable(Boolean contenteditable) {
        if ((contenteditable == null) || (!contenteditable.booleanValue()))
            removeAttribute("contenteditable");
        else
            setAttribute("contenteditable", "true");

        return self();
    }

    @Override
    public boolean isContentEditable() {
        return hasAttribute("contenteditable");
    }

    @Override
    public S setVisible(Boolean visible) {
        return setVisible(visible, null);
    }

    @Override
    public S setVisible(Boolean visible, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        addOrRemoveStyleClass("reuise--hidden" + (state == null ? "" : "_" + state.getStateKey()), !visible);
        /* if (Boolean.FALSE.equals(visible))
        style.setDisplay("none");
        else
        style.setDisplay(defaultDisplayValue != null ? defaultDisplayValue :
        "revert");
         */
        return self();
    }

    @Override
    public boolean isVisible(State state) {
        if (hasStyleClass("reuise--hidden"))
            return false;

        Style style = getStyle(state);
        if (style == null)
            return false;

        String display = style.getDisplay();
        return (display == null) || (!display.startsWith("none"));
    }

    @Override
    public S setStyle(Style style) {
        return setStyle(style, null);
    }

    @Override
    public S setStyle(Style style, State state) {
        if ((style == null) || (!style.hasProperties()))
            return self();

        styles.getStyleSheet(state).appendRule("." + getUniqueStyleClass(), style);
        return self();
    }

    @Override
    public Style getStyle() {
        return getStyle(((State) (null)));
    }

    @Override
    public Style getStyle(State state) {
        return styles.getStyleSheet(state).addRule("." + getUniqueStyleClass());
    }

    @Override
    public boolean isVisible() {
        return isVisible(null);
    }

    @Override
    public S addStoreInElementOptions(String option) {
        return self();
    }

    @Override
    public S removeStoreInElementOptions(String option) {
        return self();
    }

    @Override
    public boolean hasStoreInElementOptions(String storeInElementOptions) {
        return false;
    }

    protected String tagName;

    protected String xmlNamespace;

    protected String rehydration;

    protected DefaultWebBaseComponentPart(O options) {
        super(options);
        styles = new StyleBuilder();
    }

    protected void setupReferences() {
        // Parts
        super.setupReferences();
    }

    // Implementation
    // Implementation
    // Implementation
    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        isRehydrated = options.isRehydrated();
        this.rehydration = options.getRehydration();
        this.parent = options.getParent();
        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
        WebBaseComponentPart component = ((WebBaseComponentPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getIdOption(), component::setId);
        applicator.add(options.getTagNameOption(), component::setTagName);
        applicator.add(options.getXmlNamespaceOption(), component::setXmlNamespace);
        applicator.add(options.getTooltipOption(), component::setTooltip);
        applicator.add(options.getBaseStyleClassOption(), component::setBaseStyleClass);
        applicator.add(options.getAttributesOption(), component::setAttributes);
        applicator.add(options.getStyleClassesOption(), component::setStyleClasses);
        applicator.add(options.getDataOption(), component::setData);
        applicator.add(options.getStyleOption(), component::setStyle);
        applicator.add(options.getInlineStyleOption(), component::setInlineStyle);
        applicator.add(options.getRehydrationOption(), component::setRehydration);
        applicator.add(options.getContentEditableOption(), component::setContentEditable);
        applicator.add(options.getStoreInElementOptionsOption(), component::setStoreInElementOptions);
        if (states != null)
            states.stream().forEach((State state) -> {
                // Apply options for each (non-default) state
                applicator.add(options.getStyleOption(state), state, component::setStyle);
            });

    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise--hidden").setDisplay("none", true);
        for (ScreenSize s : ScreenSize.values())
            commonStyles.addRule(".reuise--hidden_" + s.getStateKey(), s).setDisplay("none", true);

    }

    @Override
    public WebComponentFactory getComponentFactory() {
        return ((WebComponentFactory) (super.getComponentFactory()));
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public S setTagName(String tagName) {
        this.tagName = tagName;
        return self();
    }

    @Override
    public String getXmlNamespace() {
        return xmlNamespace;
    }

    // Implementation
    @Override
    public S setXmlNamespace(String xmlNamespace) {
        setAttribute("xmlns", xmlNamespace);
        return self();
    }

    // Implementation
    @Override
    public S setStyleClass(String styleClass) {
        if ((styleClass != null) && styleClass.contains(" ")) {
            for (String s : styleClass.split(" ")) {
                addStyleClass(s);
            }
            return self();
        }
        addStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClasses(String... styleClasses) {
        setStyleClasses(new ArrayList<String>(Arrays.asList(styleClasses)));
        return self();
    }

    @Override
    public S setStyleAllStates(Style style) {
        setStyle(ScreenSizeValues.of(style, style));
        setStyle(style);
        return self();
    }

    @Override
    public String getRehydration() {
        return rehydration;
    }

    // Implementation
    @Override
    public S setRehydration(String rehydration) {
        this.rehydration = rehydration;
        isRehydrated = (rehydration != null) && (!rehydration.isEmpty());
        return self();
    }

    @Override
    public S setStoreInElementOptions(String storeInElementOptions) {
        setStoreInElementOptions(new ArrayList<String>(Arrays.asList(storeInElementOptions)));
        return self();
    }

    @Override
    public Object getMargin() {
        return getMargin(null);
    }

    @Override
    public Object getMargin(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMargin();
    }

    @Override
    public S setMargin(Object margin) {
        return setMargin(margin, null);
    }

    @Override
    public S setMargin(Object margin, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMargin(Style.parseProperty(margin));
        return self();
    }

    @Override
    public S setMarginAllStates(Object margin) {
        return self();
    }

    @Override
    public Object getMarginTop() {
        return getMarginTop(null);
    }

    @Override
    public Object getMarginTop(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMarginTop();
    }

    @Override
    public S setMarginTop(Object marginTop) {
        return setMarginTop(marginTop, null);
    }

    @Override
    public S setMarginTop(Object marginTop, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMarginTop(Style.parseProperty(marginTop));
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        return self();
    }

    @Override
    public Object getMarginRight() {
        return getMarginRight(null);
    }

    @Override
    public Object getMarginRight(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMarginRight();
    }

    @Override
    public S setMarginRight(Object marginRight) {
        return setMarginRight(marginRight, null);
    }

    @Override
    public S setMarginRight(Object marginRight, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMarginRight(Style.parseProperty(marginRight));
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        return self();
    }

    @Override
    public Object getMarginBottom() {
        return getMarginBottom(null);
    }

    @Override
    public Object getMarginBottom(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMarginBottom();
    }

    @Override
    public S setMarginBottom(Object marginBottom) {
        return setMarginBottom(marginBottom, null);
    }

    @Override
    public S setMarginBottom(Object marginBottom, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMarginBottom(Style.parseProperty(marginBottom));
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        return self();
    }

    @Override
    public Object getMarginLeft() {
        return getMarginLeft(null);
    }

    @Override
    public Object getMarginLeft(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMarginLeft();
    }

    @Override
    public S setMarginLeft(Object marginLeft) {
        return setMarginLeft(marginLeft, null);
    }

    @Override
    public S setMarginLeft(Object marginLeft, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMarginLeft(Style.parseProperty(marginLeft));
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        return self();
    }

    @Override
    public Object getWidth() {
        return getWidth(null);
    }

    @Override
    public Object getWidth(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getWidth();
    }

    @Override
    public S setWidth(Object width) {
        return setWidth(width, null);
    }

    @Override
    public S setWidth(Object width, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setWidth(Style.parseProperty(width));
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        return self();
    }

    @Override
    public Object getMinWidth() {
        return getMinWidth(null);
    }

    @Override
    public Object getMinWidth(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMinWidth();
    }

    @Override
    public S setMinWidth(Object minWidth) {
        return setMinWidth(minWidth, null);
    }

    @Override
    public S setMinWidth(Object minWidth, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMinWidth(Style.parseProperty(minWidth));
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        return self();
    }

    @Override
    public Object getMaxWidth() {
        return getMaxWidth(null);
    }

    @Override
    public Object getMaxWidth(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMaxWidth();
    }

    @Override
    public S setMaxWidth(Object maxWidth) {
        return setMaxWidth(maxWidth, null);
    }

    @Override
    public S setMaxWidth(Object maxWidth, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMaxWidth(Style.parseProperty(maxWidth));
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        return self();
    }

    @Override
    public Object getHeight() {
        return getHeight(null);
    }

    @Override
    public Object getHeight(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getHeight();
    }

    @Override
    public S setHeight(Object height) {
        return setHeight(height, null);
    }

    @Override
    public S setHeight(Object height, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setHeight(Style.parseProperty(height));
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        return self();
    }

    @Override
    public Object getMinHeight() {
        return getMinHeight(null);
    }

    @Override
    public Object getMinHeight(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMinHeight();
    }

    @Override
    public S setMinHeight(Object minHeight) {
        return setMinHeight(minHeight, null);
    }

    @Override
    public S setMinHeight(Object minHeight, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMinHeight(Style.parseProperty(minHeight));
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        return self();
    }

    @Override
    public Object getMaxHeight() {
        return getMaxHeight(null);
    }

    @Override
    public Object getMaxHeight(State state) {
        Style style = getStyle(state);
        if (style == null)
            return null;

        return style.getMaxHeight();
    }

    @Override
    public S setMaxHeight(Object maxHeight) {
        return setMaxHeight(maxHeight, null);
    }

    @Override
    public S setMaxHeight(Object maxHeight, State state) {
        Style style = getStyle(state);
        if (style == null)
            return self();

        style.setMaxHeight(Style.parseProperty(maxHeight));
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    @Override
    public S setStyle(ScreenSizeValues<Style> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Style v) -> setStyle(v, s));
        return self();
    }

    // Implementation
    public boolean isRehydrated() {
        return isRehydrated;
    }

    // Implementation
    public Style getComputedStyle() {
        return getStyle();
    }

    // Implementation
    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        return self();
    }

    // Implementation
    public boolean hasStyleClass(String styleClass) {
        return getStyleClasses().contains(styleClass);
    }

    // Implementation
    public S removeStyleClass(String styleClass) {
        return self();
    }

    // Implementation
    public S setAttribute(String attribute, String value) {
        return self();
    }

    // Implementation
    public S setAttribute(String attribute) {
        return setAttribute(attribute, null);
    }

    // Implementation
    public S removeAttribute(String attribute) {
        return self();
    }

    // Implementation
    public String getAttribute(String attribute) {
        return null;
    }

    // Implementation
    public boolean hasAttribute(String attribute) {
        return false;
    }

    // Implementation
    public S setData(String data, String value) {
        setAttribute("data-" + data, value);
        return self();
    }

    // Implementation
    public String getData(String data) {
        return getAttribute("data-" + data);
    }

    // Implementation
    public boolean hasData(String data) {
        return hasAttribute("data-" + data);
    }

    // Implementation
    public S setAria(String attribute, String value) {
        setAttribute("aria-" + attribute, value);
        return self();
    }

    // Implementation
    public String getAria(String attribute) {
        return getAttribute("aria-" + attribute);
    }

    // Implementation
    public boolean hasAria(String attribute) {
        return hasAttribute("aria-" + attribute);
    }

    // Implementation
    public String getUniqueId() {
        return null;
    }

    // Implementation
    public String getUniqueStyleClass() {
        return null;
    }

    // Implementation
    public String getStyleSheetId() {
        return getUniqueStyleClass();
    }

    // Implementation
    public String getStyleSheetId(State state) {
        if (state == null)
            return getStyleSheetId();

        return (getStyleSheetId() + "_") + state.getStateKey();
    }

    // Implementation
    public Set<State> getStyleStates() {
        return styles.getStates();
    }

    // Implementation
    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        styles.setStyleSheetFactory(styleSheetFactory);
    }

    // Implementation
    public Style getStyle(State state, Interaction interaction) {
        if ((interaction == null) || (interaction == Interaction.NORMAL))
            return getStyle(state);

        return styles.getStyleSheet(state).addRule(interaction.getSelector("." + getUniqueStyleClass()));
    }

    // Implementation
    public Style getStyle(Interaction interaction) {
        return getStyle(null, interaction);
    }
}