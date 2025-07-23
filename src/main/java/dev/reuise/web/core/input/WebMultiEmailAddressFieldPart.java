package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreMultiEmailAddressFieldPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebMultiEmailAddressFieldPart extends WebChipFieldPart , CoreMultiEmailAddressFieldPart , WebComponentPart , WebMultiEmailAddressFieldFeatures {
    WebChipFieldPart getChipFieldPart();
}