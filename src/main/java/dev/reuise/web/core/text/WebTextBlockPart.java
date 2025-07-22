package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreTextBlockPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebTextBlockPart extends WebTextPart , WebTextBlockFeatures , WebComponentPart , CoreTextBlockPart {
    WebTextPart getTextPart();
}