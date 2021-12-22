package dev.reuise.web.core.label;
import dev.reuise.core.label.CoreLabelFoundation;
public class WebLabelFoundation {
    private final CoreLabelFoundation coreLabelFoundation;

    public WebLabelFoundation(WebLabelAdapter adapter, WebLabelOptions options) {
        this.coreLabelFoundation = new CoreLabelFoundation(adapter, options.getCoreLabelOptions());
    }
}