package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebSvgShapeOptions<S extends AbstractWebSvgShapeOptions<S>> implements WebSvgShapeOptions , WebComponentOptions {
    protected AbstractWebSvgShapeOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getFill() {
        return ((String) (getOptionValue("fill")));
    }

    @Override
    public ComponentOption<String> getFillOption() {
        return ((ComponentOption<String>) (getOption("fill")));
    }

    @Override
    public S setFill(String fill) {
        setOption("fill", fill);
        return self();
    }

    private void setDefaultFill(String fill) {
        setDefaultOption("fill", fill);
    }

    @Override
    public String getStroke() {
        return ((String) (getOptionValue("stroke")));
    }

    @Override
    public ComponentOption<String> getStrokeOption() {
        return ((ComponentOption<String>) (getOption("stroke")));
    }

    @Override
    public S setStroke(String stroke) {
        setOption("stroke", stroke);
        return self();
    }

    private void setDefaultStroke(String stroke) {
        setDefaultOption("stroke", stroke);
    }

    @Override
    public Double getStrokeWidth() {
        return ((Double) (getOptionValue("strokeWidth")));
    }

    @Override
    public ComponentOption<Double> getStrokeWidthOption() {
        return ((ComponentOption<Double>) (getOption("strokeWidth")));
    }

    @Override
    public S setStrokeWidth(Double strokeWidth) {
        setOption("strokeWidth", strokeWidth);
        return self();
    }

    private void setDefaultStrokeWidth(Double strokeWidth) {
        setDefaultOption("strokeWidth", strokeWidth);
    }

    protected abstract S self();
}