package page;

import utils.Waiter;
import elementsWrappers.Button;
import elementsWrappers.InputField;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    private static final String CONTACT_LAST_NAME_LABEL = "Last Name";
    private static final String CONTACT_TITLE_LABEL = "Title";
    private static final String CONTACT_PHONE_LABEL = "Phone";
    private static final String SAVE_BUTTON_NAME = "SaveEdit";

    @FindBy(xpath = "//button[@name='SaveEdit']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[contains(text(),'lastTestName')]")
    private WebElement createdContactName;

    public ContactPage fillContactLastName(String contactLastName) {
        new InputField(CONTACT_LAST_NAME_LABEL).writeText(contactLastName);
        return this;
    }

    public ContactPage fillContactTitle(String contactTitle) {
        new InputField(CONTACT_TITLE_LABEL).writeText(contactTitle);
        return this;
    }

    public ContactPage fillContactPhone(String contactPhone) {
        new InputField(CONTACT_PHONE_LABEL).writeText(contactPhone);
        return this;
    }

    public ContactPage clickSaveButton() {
        new Button(SAVE_BUTTON_NAME).clickButton();
        return this;
    }

    public boolean isCreatedContactNameDisplayed(){
        Waiter.waitElementToBeDisplayed(createdContactName);
        return createdContactName.isDisplayed();
    }
}
