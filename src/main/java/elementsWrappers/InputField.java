package elementsWrappers;

import utils.Waiter;
import org.openqa.selenium.By;

public class InputField {

    private static final String INPUT_XPATH = "//label[contains(text(),'%s')]/ancestor::div[@part='input-text']//input";

    private String label;

    public InputField(String label) {
        this.label = label;
    }

    public void writeText(String text) {
        Waiter.waitElementToBeDisplayedByLocator(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }
}
