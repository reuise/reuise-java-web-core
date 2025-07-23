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
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
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
public abstract class DefaultWebRouteLayoutPart<S extends DefaultWebRouteLayoutPart<S, O>, O extends WebRouteLayoutPartOptions> implements WebRouteLayout , WebComponentPart {
    private Map<Integer, WebView> routeViews = new HashMap<>();

    private AntPathMatcher matcher = new AntPathMatcher();

    protected int currentRevealCount = 0;

    @Override
    public S setUrl(String url) {
        reveal(url);
        return self();
    }

    // @Override
    public S setUrl(String url, boolean updateUrl) {
        return setUrl(url);
    }

    public S addRoute(String path, RouteViewCreator creator) {
        return addRoute(path, creator, false);
    }

    public S addRoute(String path, RouteViewCreator creator, boolean preCreate) {
        return addRoute(new RouteOptions(path, creator, preCreate));
    }

    public void reveal(String url, List<RouteViewRevealHandler> revealHandlers, List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        if ((this.routeViewRevealer == null) || (url == null))
            return;

        currentRevealCount++;
        int revealCount = currentRevealCount;
        String urlPath = getUrlPath(url);
        int matches = 0;
        for (RouteOptions route : this.routes) {
            boolean match = matcher.match(route.getPath(), urlPath);
            // WebView routeView = getRouteView(route, match || isRehydrated());
            // if(routeView == null) continue; - commted out to allow null empty views
            /* routeView != null && !isCurrentView(routeView) && */
            boolean reveal = match && (matches == 0);
            RouteViewRevealOptions revealOpts = new RouteViewRevealOptions();
            revealOpts.setRoutePath(route.getPath());
            revealOpts.setPath(urlPath);
            revealOpts.setRoute(route);
            revealOpts.setReveal(reveal);
            // revealOpts.setView(routeView);
            revealOpts.setRevealHandlers(revealHandlers);
            revealOpts.setBeforeRevealHandlers(beforeRevealHandlers);
            if (match) {
                revealOpts.setParameters(matcher.extractUriTemplateVariables(route.getPath(), urlPath));
                matches++;
            }
            if ((reveal && (beforeRevealHandlers != null)) && (!beforeRevealHandlers.isEmpty())) {
                boolean revealCancelled = beforeRevealHandlers.stream().anyMatch(h -> !h.onBeforeReveal(revealOpts));
                if (revealCancelled)
                    revealOpts.setReveal(false);

                if (currentRevealCount > revealCount) {
                    if (revealCancelled)
                        reveal(revealOpts);

                    break;
                }// cancel current call and allow new call

            }
            getRouteView(route, view -> {
                revealOpts.setView(view);
                reveal(revealOpts);
            }, match || isRehydrated());
        }
    }

    public <V extends WebView> void reveal(RouteOptions route, List<RouteViewRevealHandler> revealHandlers) {
        reveal(route.getPath(), revealHandlers, null);
    }

    protected void reveal(RouteViewRevealOptions revealOpts) {
        if (this.routeViewRevealer == null)
            return;

        this.routeViewRevealer.reveal(revealOpts);
        boolean reveal = revealOpts.isReveal();
        List<RouteViewBeforeRevealHandler> beforeRevealHandlers = revealOpts.getBeforeRevealHandlers();
        if ((reveal && (beforeRevealHandlers != null)) && (!beforeRevealHandlers.isEmpty())) {
            if (beforeRevealHandlers.stream().anyMatch(h -> !h.onBeforeReveal(revealOpts)))
                reveal = false;

        }
        WebView routeView = ((WebView) (revealOpts.getView()));
        if (reveal) {
            if (routeView != null)
                routeView.onReveal(revealOpts);

            setCurrentView(routeView);
        } else if (routeView != null)
            routeView.onHide();

        if (reveal) {
            List<RouteViewRevealHandler> revealHandlers = revealOpts.getRevealHandlers();
            if (revealHandlers != null)
                revealHandlers.forEach(h -> h.onReveal(routeView, revealOpts));

        }
    }

    public void reveal(RouteOptions route, boolean reveal, boolean forceCreate) {
        if (this.routeViewRevealer == null)
            return;

        getRouteView(route, view -> {
            if (view == null)
                return;

            RouteViewRevealOptions revealOpts = new RouteViewRevealOptions();
            revealOpts.setRoute(route);
            revealOpts.setReveal(reveal);
            revealOpts.setView(view);
            reveal(revealOpts);
        }, forceCreate);
    }

    public void reveal(RouteOptions route, boolean reveal) {
        reveal(route, reveal, reveal);
    }

    private String getUrlPath(String url) {
        if (url == null)
            return null;

        String path = url;
        int protoIndex = path.indexOf("://");
        if (protoIndex != (-1))
            path = path.substring(protoIndex + 3);

        int hashIndex = path.indexOf("#");
        if (hashIndex != (-1))
            path = path.substring(0, hashIndex);

        int queryIndex = path.indexOf("?");
        if (queryIndex != (-1))
            path = path.substring(0, queryIndex);

        return path.substring(path.indexOf("/"));
    }

    private void getRouteView(RouteOptions route, Consumer<WebView> viewCallback, boolean create) {
        WebView routeView = null;
        int routeIndex = this.routes.indexOf(route);
        if (routeIndex != (-1))
            routeView = routeViews.get(routeIndex);

        if (routeView != null) {
            if (viewCallback != null)
                viewCallback.accept(routeView);

            return;
        }
        if (!create) {
            if (viewCallback != null)
                viewCallback.accept(routeView);

            return;
        }
        createView(route, view -> {
            viewCallback.accept(view);
            if (view != null)
                add(view);

            routeViews.put(routeIndex, view);
        });
    }

    protected void createView(RouteOptions route, Consumer<WebView> viewCallback) {
        RouteViewCreator routeViewCreator = route.getViewCreator();
        if (routeViewCreator == null)
            return;

        WebView routeView = routeViewCreator.create(route);
        if (viewCallback != null)
            viewCallback.accept(routeView);

    }

    @Override
    public WebView getCurrentView() {
        return null;
    }

    @Override
    public S setCurrentView(WebView currentView) {
        return self();
    }

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected List<RouteOptions> routes;

    protected RouteViewRevealer routeViewRevealer;

    protected List<RouteViewRevealHandler> revealHandlers;

    protected List<RouteViewBeforeRevealHandler> beforeRevealHandlers;

    protected DefaultWebRouteLayoutPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
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
        this.containerPart.setRootComponent(rootComponent);
    }

    @Override
    public S add(CoreComponent child) {
        containerPart.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        containerPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        containerPart.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        containerPart.remove(child);
    }

    @Override
    public void removeAll() {
        containerPart.removeAll();
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
        baseComponentPart.initialize(component, options);
    }

    @Override
    public WebRouteLayout getComponent() {
        return ((WebRouteLayout) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        setupReferences();
        return true;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        WebRouteLayoutPart component = ((WebRouteLayoutPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getUrlOption(), component::setUrl);
        applicator.add(options.getRoutesOption(), component::setRoutes);
        applicator.add(options.getRouteViewRevealerOption(), component::setRouteViewRevealer);
        applicator.add(options.getRevealHandlersOption(), component::setRevealHandlers);
        applicator.add(options.getBeforeRevealHandlersOption(), component::setBeforeRevealHandlers);
        applicator.add(options.getCurrentViewOption(), component::setCurrentView);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        containerPart.onInitializeComponentType(rootComponent);
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-routelayout").setWidth("100%").setHeight("100%");
    }

    protected abstract S self();

    @Override
    public List<RouteOptions> getRoutes() {
        return routes;
    }

    @Override
    public S setRoutes(List<RouteOptions> routes) {
        // Create copy of
        this.routes = new ArrayList<RouteOptions>(routes);
        return self();
    }

    // Implementation
    @Override
    public S addRoute(RouteOptions route) {
        this.routes.add(route);
        String urlPath = getUrlPath(getUrl());
        String routePath = route.getPath();
        if (matcher.match(routePath, urlPath))
            reveal(urlPath);
        else if (route.isPreCreate()) {
            getRouteView(route, view -> {
                if (view != null)
                    view.setVisible(false);

            }, true);
        }
        return self();
    }

    @Override
    public S removeRoute(RouteOptions route) {
        this.routes.remove(route);
        return self();
    }

    @Override
    public boolean hasRoute(RouteOptions route) {
        return this.routes.contains(route);
    }

    @Override
    public RouteViewRevealer getRouteViewRevealer() {
        return routeViewRevealer;
    }

    @Override
    public S setRouteViewRevealer(RouteViewRevealer routeViewRevealer) {
        this.routeViewRevealer = routeViewRevealer;
        return self();
    }

    @Override
    public List<RouteViewRevealHandler> getRevealHandlers() {
        return revealHandlers;
    }

    @Override
    public S setRevealHandlers(List<RouteViewRevealHandler> revealHandlers) {
        // Create copy of
        this.revealHandlers = new ArrayList<RouteViewRevealHandler>(revealHandlers);
        return self();
    }

    @Override
    public S addRevealHandler(RouteViewRevealHandler revealHandler) {
        if (this.revealHandlers == null) {
            setRevealHandlers(new ArrayList<RouteViewRevealHandler>());
        }
        this.revealHandlers.add(revealHandler);
        return self();
    }

    @Override
    public S setRevealHandler(RouteViewRevealHandler revealHandler) {
        setRevealHandlers(new ArrayList<RouteViewRevealHandler>(Arrays.asList(revealHandler)));
        return self();
    }

    @Override
    public S removeRevealHandler(RouteViewRevealHandler revealHandler) {
        this.revealHandlers.remove(revealHandler);
        return self();
    }

    @Override
    public List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers() {
        return beforeRevealHandlers;
    }

    @Override
    public S setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        // Create copy of
        this.beforeRevealHandlers = new ArrayList<RouteViewBeforeRevealHandler>(beforeRevealHandlers);
        return self();
    }

    @Override
    public S addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        if (this.beforeRevealHandlers == null) {
            setBeforeRevealHandlers(new ArrayList<RouteViewBeforeRevealHandler>());
        }
        this.beforeRevealHandlers.add(beforeRevealHandler);
        return self();
    }

    @Override
    public S setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        setBeforeRevealHandlers(new ArrayList<RouteViewBeforeRevealHandler>(Arrays.asList(beforeRevealHandler)));
        return self();
    }

    @Override
    public S removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        this.beforeRevealHandlers.remove(beforeRevealHandler);
        return self();
    }

    // Implementation
    public boolean isCurrentView(WebView view) {
        return false;
    }

    // Implementation
    public Collection<WebView> getViews() {
        return routeViews.values();
    }

    // Implementation
    public void reveal(String url) {
        reveal(url, getRevealHandlers(), getBeforeRevealHandlers());
    }

    public void reveal(String url, boolean updateUrl) {
    }

    public void reveal(String url, Collection<RouteViewRevealHandler> handler) {
    }

    public void reveal(WebView route, Collection<RouteViewRevealHandler> handler) {
    }

    public void reveal(WebView route, boolean reveal) {
    }

    public void reveal(WebView route, boolean reveal, boolean forceCreate) {
    }
}