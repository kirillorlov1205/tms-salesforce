import model.Account;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.LoginPageService;

public class AccountPageTest extends BaseTest {

    private User user;
    private Account account;
    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
        account = new Account();
    }

    @Test(testName = "Verify successful account creation", priority = 1)
    public void verifySuccessfulAccountCreation() {
        boolean isCreatedAccountNameDisplayed = loginPageService
                .login(user)
                .openNewAccountPage()
                .createAccount(account)
                .isCreatedAccountNameDisplayed();
        Assert.assertTrue(isCreatedAccountNameDisplayed, "Account has not been created");
    }
}
