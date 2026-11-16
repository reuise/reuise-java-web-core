package dev.reuise.web.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.State;
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
        restoreClientConfiguration(values, null);
    }

    public void restoreClientConfiguration(Map<String, Object> values, State state) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "contentEditable": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "margin": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginTop": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginRight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginBottom": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginLeft": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "width": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "height": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "visible": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "enabled": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "hoverScale": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.decimal(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "border": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "borderColor": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "borderWidth": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "borderRadius": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "background": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "backgroundColor": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "useHistoryApi": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "loading": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "label": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "size": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, values.get(key) == null ? null : dev.reuise.core.button.ButtonSize.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "type": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, values.get(key) == null ? null : dev.reuise.core.button.ButtonType.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "target": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
