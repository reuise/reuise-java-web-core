package dev.reuise.web.core.input;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.input.CoreSegmentedTextField;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebRowLayout;
public interface WebSegmentedTextField extends WebRowLayout , WebSegmentedTextFieldPart , CoreSegmentedTextField , WebComponent {
    WebSegmentedTextField getComponent();

    WebSegmentedTextField setAnimation(ComponentAnimation animation);

    WebSegmentedTextField startAnimation();

    WebSegmentedTextField cancelAnimation();
}
