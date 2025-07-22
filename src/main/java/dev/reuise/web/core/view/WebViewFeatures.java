package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreViewFeatures;
import java.util.Map;
public interface WebViewFeatures extends CoreViewFeatures {
    Map<String, String> getParameters();

    String getContentType();
}