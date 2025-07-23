package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreHeading;
import dev.reuise.web.core.WebComponent;
public interface WebHeading extends WebText , WebComponent , WebHeadingPart , CoreHeading {
    WebHeading getComponent();
}