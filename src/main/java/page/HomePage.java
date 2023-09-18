package page;

import driver.DriverSingleTone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='slds-button slds-show']")
    private WebElement sideMenuButton;

    public boolean isSideMenuButtonDisplayed() {
        Waiter.waitElementToBeDisplayed(sideMenuButton);
        return sideMenuButton.isDisplayed();
    }

    public HomePage openNewAccountPage() {
        DriverSingleTone.getInstance().getDriver().get("https://customer-app-2425.lightning.force.com/lightning/o/" +
                "Account/new?count=1");
        return this;
    }

    public ContactPage openNewContactPage() {
        DriverSingleTone.getInstance().getDriver().get("https://customer-app-2425.lightning.force.com/lightning/o/" +
                "Contact/new");
        return new ContactPage();
    }
}
