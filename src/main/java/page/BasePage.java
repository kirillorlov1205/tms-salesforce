package page;

import driver.DriverSingleTone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver = DriverSingleTone.getInstance().getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }
}
