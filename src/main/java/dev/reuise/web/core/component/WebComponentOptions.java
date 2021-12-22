package dev.reuise.web.core.component;
import dev.reuise.core.component.CoreComponentOptions;
public class WebComponentOptions {
    private String tagName = "div";

    private String id;

    private final CoreComponentOptions coreComponentOptions;

    public WebComponentOptions() {
        this.coreComponentOptions = new CoreComponentOptions();
    }

    public CoreComponentOptions getCoreComponentOptions() {
        return this.coreComponentOptions;
    }

    /**
     * Gets the id of the component's element
     *
     * @return Id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the id of the component's element
     *
     * @param id:
     * 		Id
     * @return Options instance
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the component's element tag name
     *
     * @return TagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Sets the component's element tag name
     *
     * @param tagName:
     * 		TagName
     * @return Options instance
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}