package dev.reuise.web.core.document;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.webstyles.StyleSheet;
import java.util.List;
import java.util.Map;
public interface WebDocumentPartOptions {
    String getTitle();

    ComponentOption<String> getTitleOption();

    WebDocumentPartOptions setTitle(String title);

    String getViewId();

    ComponentOption<String> getViewIdOption();

    WebDocumentPartOptions setViewId(String viewId);

    String getDescription();

    ComponentOption<String> getDescriptionOption();

    WebDocumentPartOptions setDescription(String description);

    List<String> getKeywords();

    ComponentOption<List<String>> getKeywordsOption();

    WebDocumentPartOptions setKeywords(List<String> keywords);

    WebDocumentPartOptions addKeyword(String keyword);

    WebDocumentPartOptions removeKeyword(String keyword);

    boolean hasKeyword(String keyword);

    String getThemeColor();

    ComponentOption<String> getThemeColorOption();

    WebDocumentPartOptions setThemeColor(String themeColor);

    String getLanguage();

    ComponentOption<String> getLanguageOption();

    WebDocumentPartOptions setLanguage(String language);

    String getPath();

    ComponentOption<String> getPathOption();

    WebDocumentPartOptions setPath(String path);

    String getUrl();

    ComponentOption<String> getUrlOption();

    WebDocumentPartOptions setUrl(String url);

    String getCharset();

    ComponentOption<String> getCharsetOption();

    WebDocumentPartOptions setCharset(String charset);

    List<StyleSheet> getStyleSheet();

    ComponentOption<List<StyleSheet>> getStyleSheetOption();

    WebDocumentPartOptions setStyleSheet(List<StyleSheet> styleSheet);

    WebDocumentPartOptions addStyleSheet(StyleSheet styleSheet);

    WebDocumentPartOptions setStyleSheet(StyleSheet styleSheet);

    WebDocumentPartOptions removeStyleSheet(StyleSheet styleSheet);

    Map<String, Object> getModel();

    ComponentOption<Map<String, Object>> getModelOption();

    WebDocumentPartOptions setModel(Map<String, Object> model);

    Map<String, String> getUrlParameters();

    ComponentOption<Map<String, String>> getUrlParametersOption();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebDocumentBodyOptions getBodyOptions();

    WebDocumentPartOptions setBodyOptions(WebDocumentBodyOptions bodyOptions);

    boolean hasBodyOptions();

    ComponentCreator<? extends WebDocumentBody, ? extends WebDocumentBodyOptions> getBodyCreator();

    WebComponentFactory getComponentFactory();

    WebDocument getComponent();
}