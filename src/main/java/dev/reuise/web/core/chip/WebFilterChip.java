package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreFilterChip;
import dev.reuise.web.core.WebComponent;
public interface WebFilterChip extends WebChip , CoreFilterChip , WebFilterChipPart , WebComponent {
    WebFilterChip getComponent();
}