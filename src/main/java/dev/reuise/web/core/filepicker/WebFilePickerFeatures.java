package dev.reuise.web.core.filepicker;
public interface WebFilePickerFeatures {
    String getAccept();

    WebFilePickerFeatures setAccept(String accept);

    boolean isMultiple();

    WebFilePickerFeatures setMultiple(Boolean multiple);
}