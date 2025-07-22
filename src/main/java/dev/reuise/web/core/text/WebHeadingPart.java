package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreHeadingPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebHeadingPart extends WebTextPart , WebComponentPart , CoreHeadingPart , WebHeadingFeatures {
    WebTextPart getTextPart();
}