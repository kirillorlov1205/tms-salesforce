package page;

import driver.DriverSingleTone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private final String LOGIN_PAGE_URL = "https://customer-app-2425.my.salesforce.com/";

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    public LoginPage fillInUserName(String userName) {
        usernameField.sendKeys(userName);
        return this;
    }

    public LoginPage fillInPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getLoginPageUrl() {
        return LOGIN_PAGE_URL;
    }

    public LoginPage openPage(String url) {
        DriverSingleTone.getInstance().getDriver().get(url);
        return this;
    }
}
