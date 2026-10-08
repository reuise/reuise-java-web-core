package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreSegmentedTextFieldPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebRowLayoutPart;
public interface WebSegmentedTextFieldPart extends WebRowLayoutPart , WebSegmentedTextFieldFeatures , WebComponentPart , CoreSegmentedTextFieldPart {
    WebRowLayoutPart getRowLayoutPart();
}
