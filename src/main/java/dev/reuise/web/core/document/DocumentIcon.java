package dev.reuise.web.core.document;

public class DocumentIcon {
    private String path;
    private String type;
    private Integer width;
    private Integer height;

    public DocumentIcon(String path, String type, Integer width, Integer height) {
        this.path = path;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public DocumentIcon(String path, String type, Integer size) {
        this(path, type, size, size);
    }

    public DocumentIcon(String path, String type) {
        this(path, type, -1, -1);
    }

    public DocumentIcon(String path) {
        this(path, null);
        
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
