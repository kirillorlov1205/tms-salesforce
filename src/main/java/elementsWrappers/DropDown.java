package elementsWrappers;

import utils.Waiter;
import org.openqa.selenium.By;

public class DropDown {

    private static final String DROP_DOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::span[contains" +
            "(@class, 'test')]//button";
    private static final String SELECT_OPTION_XPATH = "//*[@role='option']//span[contains(text(),'%s')]";

    private String label;

    public DropDown(String label) {
        this.label = label;
    }

    public void selectOption(String option) {
        Waiter.waitElementToBeDisplayedByLocator(By.xpath(String.format(DROP_DOWN_XPATH, label))).click();
        Waiter.waitElementToBeDisplayedByLocator(By.xpath(String.format(SELECT_OPTION_XPATH, option))).click();
    }
}
