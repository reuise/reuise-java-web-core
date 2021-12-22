package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonOptions;
public class WebButtonOptions {
    private final CoreButtonOptions coreButtonOptions;

    public WebButtonOptions() {
        this.coreButtonOptions = new CoreButtonOptions();
    }

    public CoreButtonOptions getCoreButtonOptions() {
        return this.coreButtonOptions;
    }

    /**
     * Gets the label on the button
     *
     * @return Label
     */
    public String getLabel() {
        return coreButtonOptions.getLabel();
    }

    /**
     * Sets the label on the button
     *
     * @param label:
     * 		Label
     * @return Options instance
     */
    public void setLabel(String label) {
        coreButtonOptions.setLabel(label);
    }
}