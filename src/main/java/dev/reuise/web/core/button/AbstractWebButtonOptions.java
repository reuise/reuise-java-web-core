package dev.reuise.web.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.AbstractCoreButtonOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
import java.util.Map;
public abstract class AbstractWebButtonOptions<S extends AbstractWebButtonOptions<S>> extends AbstractCoreButtonOptions<S> implements ClientConfigurationOptions , WebButtonOptions {
    @Override
    public S setBorder(boolean enabled) {
        String width = getBorderWidth();
        String color = getBorderColor();
        return setBorder(enabled ? ((width == null ? "1px" : width) + " solid ") + (color == null ? "currentColor" : color) : "none");
    }

    @Override
    public S setBackground(boolean enabled) {
        if (enabled && (!"none".equalsIgnoreCase(getBackground())))
            return self();

        return setBackground(enabled ? null : "none");
    }

    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        setUseHistoryApi(useHistoryApi);
        return self();
    }

    protected AbstractWebButtonOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        setDefaultHoverScale(1.0);
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public Double getHoverScale() {
        return ((Double) (getOptionValue("hoverScale")));
    }

    @Override
    public ComponentOption<Double> getHoverScaleOption() {
        return ((ComponentOption<Double>) (getOption("hoverScale")));
    }

    @Override
    public S setHoverScale(Double hoverScale) {
        setOption("hoverScale", hoverScale, true);
        return self();
    }

    private void setDefaultHoverScale(Double hoverScale) {
        setDefaultOption("hoverScale", hoverScale, true);
    }

    @Override
    public String getBorder() {
        return ((String) (getOptionValue("border")));
    }

    @Override
    public ComponentOption<String> getBorderOption() {
        return ((ComponentOption<String>) (getOption("border")));
    }

    @Override
    public S setBorder(String border) {
        setOption("border", border, true);
        return self();
    }

    private void setDefaultBorder(String border) {
        setDefaultOption("border", border, true);
    }

    @Override
    public String getBorderColor() {
        return ((String) (getOptionValue("borderColor")));
    }

    @Override
    public ComponentOption<String> getBorderColorOption() {
        return ((ComponentOption<String>) (getOption("borderColor")));
    }

    @Override
    public S setBorderColor(String borderColor) {
        setOption("borderColor", borderColor, true);
        return self();
    }

    private void setDefaultBorderColor(String borderColor) {
        setDefaultOption("borderColor", borderColor, true);
    }

    @Override
    public String getBorderWidth() {
        return ((String) (getOptionValue("borderWidth")));
    }

    @Override
    public ComponentOption<String> getBorderWidthOption() {
        return ((ComponentOption<String>) (getOption("borderWidth")));
    }

    @Override
    public S setBorderWidth(String borderWidth) {
        setOption("borderWidth", borderWidth, true);
        return self();
    }

    private void setDefaultBorderWidth(String borderWidth) {
        setDefaultOption("borderWidth", borderWidth, true);
    }

    @Override
    public String getBorderRadius() {
        return ((String) (getOptionValue("borderRadius")));
    }

    @Override
    public ComponentOption<String> getBorderRadiusOption() {
        return ((ComponentOption<String>) (getOption("borderRadius")));
    }

    @Override
    public S setBorderRadius(String borderRadius) {
        setOption("borderRadius", borderRadius, true);
        return self();
    }

    private void setDefaultBorderRadius(String borderRadius) {
        setDefaultOption("borderRadius", borderRadius, true);
    }

    @Override
    public String getBackground() {
        return ((String) (getOptionValue("background")));
    }

    @Override
    public ComponentOption<String> getBackgroundOption() {
        return ((ComponentOption<String>) (getOption("background")));
    }

    @Override
    public S setBackground(String background) {
        setOption("background", background, true);
        return self();
    }

    private void setDefaultBackground(String background) {
        setDefaultOption("background", background, true);
    }

    @Override
    public String getBackgroundColor() {
        return ((String) (getOptionValue("backgroundColor")));
    }

    @Override
    public ComponentOption<String> getBackgroundColorOption() {
        return ((ComponentOption<String>) (getOption("backgroundColor")));
    }

    @Override
    public S setBackgroundColor(String backgroundColor) {
        setOption("backgroundColor", backgroundColor, true);
        return self();
    }

    private void setDefaultBackgroundColor(String backgroundColor) {
        setDefaultOption("backgroundColor", backgroundColor, true);
    }

    @Override
    public boolean isUseHistoryApi() {
        return Boolean.TRUE.equals(getOptionValue("useHistoryApi"));
    }

    @Override
    public ComponentOption<Boolean> getUseHistoryApiOption() {
        return ((ComponentOption<Boolean>) (getOption("useHistoryApi")));
    }

    @Override
    public S setUseHistoryApi(Boolean useHistoryApi) {
        setOption("useHistoryApi", useHistoryApi, true);
        return self();
    }

    private void setDefaultUseHistoryApi(Boolean useHistoryApi) {
        setDefaultOption("useHistoryApi", useHistoryApi, true);
    }

    protected WebIconOptions createDefaultStartIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultStartIconOptions()));
        options.setStyleClass("reuise-button_starticon");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setBaseStyleClass("reuise-button_label");
        options.setStyleClass("reuise-button_label");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-button_endicon");
        return options;
    }

    public String getClientConfigurationType() {
        return "Button";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hoverScale": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHoverScale(dev.reuise.web.core.hydration.ClientConfiguration.decimal(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "border": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorder(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderColor": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderColor(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderWidth": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderWidth(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderRadius": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderRadius(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "background": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBackground(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "backgroundColor": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBackgroundColor(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "useHistoryApi": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setUseHistoryApi(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "loading": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLoading(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "size": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSize(values.get(key) == null ? null : dev.reuise.core.button.ButtonSize.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "type": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setType(values.get(key) == null ? null : dev.reuise.core.button.ButtonType.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "target": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTarget(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
