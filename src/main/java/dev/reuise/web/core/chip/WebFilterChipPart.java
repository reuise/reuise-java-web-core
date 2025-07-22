package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreFilterChipPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebFilterChipPart extends WebFilterChipFeatures , WebChipPart , WebComponentPart , CoreFilterChipPart {
    WebChipPart getChipPart();
}