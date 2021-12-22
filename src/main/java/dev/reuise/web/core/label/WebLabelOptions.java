package dev.reuise.web.core.label;
import dev.reuise.core.label.CoreLabelOptions;
public class WebLabelOptions {
    private final CoreLabelOptions coreLabelOptions;

    public WebLabelOptions() {
        this.coreLabelOptions = new CoreLabelOptions();
    }

    public CoreLabelOptions getCoreLabelOptions() {
        return this.coreLabelOptions;
    }
}