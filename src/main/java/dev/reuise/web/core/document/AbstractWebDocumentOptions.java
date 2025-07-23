package dev.reuise.web.core.document;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.webstyles.StyleSheet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
public abstract class AbstractWebDocumentOptions<S extends AbstractWebDocumentOptions<S>> implements WebDocumentOptions , WebComponentOptions {
    protected dev.reuise.web.core.document.WebDocumentBodyOptions bodyOptions;

    protected AbstractWebDocumentOptions() {
        bodyOptions = createDefaultBodyOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultKeywords(new ArrayList<>());
        setDefaultLanguage("en");
        setDefaultCharset("utf-8");
        setDefaultStyleSheet(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getTitle() {
        return ((String) (getOptionValue("title")));
    }

    @Override
    public ComponentOption<String> getTitleOption() {
        return ((ComponentOption<String>) (getOption("title")));
    }

    @Override
    public S setTitle(String title) {
        setOption("title", title);
        setLayoutChildrenTitle(title);
        return self();
    }

    protected void setLayoutChildrenTitle(String title) {
    }

    private void setDefaultTitle(String title) {
        setDefaultOption("title", title);
        setLayoutChildrenTitle(title);
    }

    @Override
    public String getViewId() {
        return ((String) (getOptionValue("viewId")));
    }

    @Override
    public ComponentOption<String> getViewIdOption() {
        return ((ComponentOption<String>) (getOption("viewId")));
    }

    @Override
    public S setViewId(String viewId) {
        setOption("viewId", viewId);
        setLayoutChildrenViewId(viewId);
        return self();
    }

    protected void setLayoutChildrenViewId(String viewId) {
    }

    private void setDefaultViewId(String viewId) {
        setDefaultOption("viewId", viewId);
        setLayoutChildrenViewId(viewId);
    }

    @Override
    public String getDescription() {
        return ((String) (getOptionValue("description")));
    }

    @Override
    public ComponentOption<String> getDescriptionOption() {
        return ((ComponentOption<String>) (getOption("description")));
    }

    @Override
    public S setDescription(String description) {
        setOption("description", description);
        setLayoutChildrenDescription(description);
        return self();
    }

    protected void setLayoutChildrenDescription(String description) {
    }

    private void setDefaultDescription(String description) {
        setDefaultOption("description", description);
        setLayoutChildrenDescription(description);
    }

    @Override
    public List<String> getKeywords() {
        return ((List<String>) (getOptionValue("keywords")));
    }

    @Override
    public ComponentOption<List<String>> getKeywordsOption() {
        return ((ComponentOption<List<String>>) (getOption("keywords")));
    }

    @Override
    public S setKeywords(List<String> keywords) {
        setOption("keywords", keywords);
        return self();
    }

    @Override
    public S addKeyword(String keyword) {
        List<String> list = getKeywords();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setKeywords(list);
        }
        list.add(keyword);
        return self();
    }

    @Override
    public S removeKeyword(String keyword) {
        List<String> list = getKeywords();
        if (list == null) {
            return self();
        }
        list.remove(keyword);
        return self();
    }

    @Override
    public boolean hasKeyword(String keyword) {
        List<String> list = getKeywords();
        if (list == null) {
            return false;
        }
        return list.contains(keyword);
    }

    private void setDefaultKeywords(List<String> keywords) {
        setDefaultOption("keywords", keywords);
    }

    @Override
    public String getThemeColor() {
        return ((String) (getOptionValue("themeColor")));
    }

    @Override
    public ComponentOption<String> getThemeColorOption() {
        return ((ComponentOption<String>) (getOption("themeColor")));
    }

    @Override
    public S setThemeColor(String themeColor) {
        setOption("themeColor", themeColor);
        setLayoutChildrenThemeColor(themeColor);
        return self();
    }

    protected void setLayoutChildrenThemeColor(String themeColor) {
    }

    private void setDefaultThemeColor(String themeColor) {
        setDefaultOption("themeColor", themeColor);
        setLayoutChildrenThemeColor(themeColor);
    }

    @Override
    public String getLanguage() {
        return ((String) (getOptionValue("language")));
    }

    @Override
    public ComponentOption<String> getLanguageOption() {
        return ((ComponentOption<String>) (getOption("language")));
    }

    @Override
    public S setLanguage(String language) {
        setOption("language", language);
        setLayoutChildrenLanguage(language);
        return self();
    }

    protected void setLayoutChildrenLanguage(String language) {
    }

    private void setDefaultLanguage(String language) {
        setDefaultOption("language", language);
        setLayoutChildrenLanguage(language);
    }

    @Override
    public String getPath() {
        return ((String) (getOptionValue("path")));
    }

    @Override
    public ComponentOption<String> getPathOption() {
        return ((ComponentOption<String>) (getOption("path")));
    }

    @Override
    public S setPath(String path) {
        setOption("path", path);
        setLayoutChildrenPath(path);
        return self();
    }

    protected void setLayoutChildrenPath(String path) {
    }

    private void setDefaultPath(String path) {
        setDefaultOption("path", path);
        setLayoutChildrenPath(path);
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        setLayoutChildrenUrl(url);
        return self();
    }

    protected void setLayoutChildrenUrl(String url) {
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
    }

    @Override
    public String getCharset() {
        return ((String) (getOptionValue("charset")));
    }

    @Override
    public ComponentOption<String> getCharsetOption() {
        return ((ComponentOption<String>) (getOption("charset")));
    }

    @Override
    public S setCharset(String charset) {
        setOption("charset", charset);
        setLayoutChildrenCharset(charset);
        return self();
    }

    protected void setLayoutChildrenCharset(String charset) {
    }

    private void setDefaultCharset(String charset) {
        setDefaultOption("charset", charset);
        setLayoutChildrenCharset(charset);
    }

    @Override
    public List<StyleSheet> getStyleSheet() {
        return ((List<StyleSheet>) (getOptionValue("styleSheet")));
    }

    @Override
    public ComponentOption<List<StyleSheet>> getStyleSheetOption() {
        return ((ComponentOption<List<StyleSheet>>) (getOption("styleSheet")));
    }

    @Override
    public S setStyleSheet(List<StyleSheet> styleSheet) {
        setOption("styleSheet", styleSheet);
        return self();
    }

    @Override
    public S addStyleSheet(StyleSheet styleSheet) {
        List<StyleSheet> list = getStyleSheet();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setStyleSheet(list);
        }
        list.add(styleSheet);
        return self();
    }

    @Override
    public S setStyleSheet(StyleSheet styleSheet) {
        setStyleSheet(new ArrayList<StyleSheet>(Arrays.asList(styleSheet)));
        return self();
    }

    @Override
    public S removeStyleSheet(StyleSheet styleSheet) {
        List<StyleSheet> list = getStyleSheet();
        if (list == null) {
            return self();
        }
        list.remove(styleSheet);
        return self();
    }

    private void setDefaultStyleSheet(List<StyleSheet> styleSheet) {
        setDefaultOption("styleSheet", styleSheet);
    }

    @Override
    public Map<String, Object> getModel() {
        return ((Map<String, Object>) (getOptionValue("model")));
    }

    @Override
    public ComponentOption<Map<String, Object>> getModelOption() {
        return ((ComponentOption<Map<String, Object>>) (getOption("model")));
    }

    @Override
    public S setModel(Map<String, Object> model) {
        setOption("model", model);
        setLayoutChildrenModel(model);
        return self();
    }

    protected void setLayoutChildrenModel(Map<String, Object> model) {
    }

    private void setDefaultModel(Map<String, Object> model) {
        setDefaultOption("model", model);
        setLayoutChildrenModel(model);
    }

    @Override
    public Map<String, String> getUrlParameters() {
        return ((Map<String, String>) (getOptionValue("urlParameters")));
    }

    @Override
    public ComponentOption<Map<String, String>> getUrlParametersOption() {
        return ((ComponentOption<Map<String, String>>) (getOption("urlParameters")));
    }

    protected void setLayoutChildrenUrlParameters(Map<String, String> urlParameters) {
    }

    private void setDefaultUrlParameters(Map<String, String> urlParameters) {
        setDefaultOption("urlParameters", urlParameters);
        setLayoutChildrenUrlParameters(urlParameters);
    }

    @Override
    public dev.reuise.web.core.document.WebDocumentBodyOptions getBodyOptions() {
        return bodyOptions;
    }

    @Override
    public boolean hasBodyOptions() {
        return bodyOptions != null;
    }

    @Override
    public S setBodyOptions(dev.reuise.web.core.document.WebDocumentBodyOptions bodyOptions) {
        if (!hasBodyOptions())
            this.bodyOptions = createDefaultBodyOptions();

        // Merge with default options
        this.bodyOptions.merge(bodyOptions);
        return self();
    }

    protected WebDocumentBodyOptions createDefaultBodyOptions() {
        WebDocumentBodyOptions options = getComponentFactory().createDocumentBodyOptions();
        options.setStyleClass("reuise-document_body");
        return options;
    }

    protected abstract S self();
}