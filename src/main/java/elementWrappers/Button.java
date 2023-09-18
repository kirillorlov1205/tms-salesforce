package elementWrappers;

import utils.Waiter;
import org.openqa.selenium.By;

public class Button {

    private static final String BUTTON_XPATH = "//button[@name='%s']";

    private String name;

    public Button(String name) {
        this.name = name;
    }

    public void clickButton() {
        Waiter.waitElementToBeDisplayedByLocator(By.xpath(String.format(BUTTON_XPATH, name))).click();
    }
}
