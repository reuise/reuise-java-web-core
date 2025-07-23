package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreFieldSet;
import dev.reuise.web.core.WebComponent;
public interface WebFieldSet extends CoreFieldSet , WebComponent , WebContainer , WebFieldSetPart {
    WebFieldSet getComponent();
}