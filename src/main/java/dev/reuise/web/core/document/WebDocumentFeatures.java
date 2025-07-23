package dev.reuise.web.core.document;
import dev.reuise.webstyles.StyleSheet;
import java.util.List;
import java.util.Map;
public interface WebDocumentFeatures {
    String getTitle();

    WebDocumentFeatures setTitle(String title);

    String getViewId();

    WebDocumentFeatures setViewId(String viewId);

    String getDescription();

    WebDocumentFeatures setDescription(String description);

    List<String> getKeywords();

    WebDocumentFeatures setKeywords(List<String> keywords);

    WebDocumentFeatures addKeyword(String keyword);

    WebDocumentFeatures removeKeyword(String keyword);

    boolean hasKeyword(String keyword);

    String getThemeColor();

    WebDocumentFeatures setThemeColor(String themeColor);

    String getLanguage();

    WebDocumentFeatures setLanguage(String language);

    String getPath();

    WebDocumentFeatures setPath(String path);

    String getUrl();

    WebDocumentFeatures setUrl(String url);

    String getCharset();

    WebDocumentFeatures setCharset(String charset);

    List<StyleSheet> getStyleSheet();

    WebDocumentFeatures setStyleSheet(List<StyleSheet> styleSheet);

    WebDocumentFeatures addStyleSheet(StyleSheet styleSheet);

    WebDocumentFeatures setStyleSheet(StyleSheet styleSheet);

    WebDocumentFeatures removeStyleSheet(StyleSheet styleSheet);

    Map<String, Object> getModel();

    WebDocumentFeatures setModel(Map<String, Object> model);

    Map<String, String> getUrlParameters();
}