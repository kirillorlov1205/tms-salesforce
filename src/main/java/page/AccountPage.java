package page;

import utils.Waiter;
import elementsWrappers.Button;
import elementsWrappers.DropDown;
import elementsWrappers.InputField;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    private static final String ACCOUNT_NAME_LABEL = "Account Name";
    private static final String ACCOUNT_WEBSITE_LABEL = "Website";
    private static final String ACCOUNT_INDUSTRY_LABEL = "Industry";
    private static final String SAVE_BUTTON_NAME = "SaveEdit";

    @FindBy(xpath = "//lightning-formatted-text[contains(text(),'testName')]")
    private WebElement createdAccountName;

    public AccountPage fillAccountName(String accountName) {
        new InputField(ACCOUNT_NAME_LABEL).writeText(accountName);
        return this;
    }

    public AccountPage fillAccountWebsite(String accountWebsite) {
        new InputField(ACCOUNT_WEBSITE_LABEL).writeText(accountWebsite);
        return this;
    }

    public AccountPage fillAccountIndustry(String accountIndustry) {
        new DropDown(ACCOUNT_INDUSTRY_LABEL).selectOption(accountIndustry);
        return this;
    }

    public AccountPage clickSaveButton() {
        new Button(SAVE_BUTTON_NAME).clickButton();
        return this;
    }

    public boolean isCreatedAccountNameDisplayed(){
        Waiter.waitElementToBeDisplayed(createdAccountName);
        return createdAccountName.isDisplayed();
    }
}
