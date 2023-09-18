import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.HomePageService;
import service.LoginPageService;

public class LoginPageTest extends BaseTest {

    private User user;
    private LoginPageService loginPageService;
    private HomePageService homePageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        homePageService = new HomePageService();
        user = new User();
    }

    @Test(testName = "Verify successful login with correct credentials")
    public void verifySuccessfulLoginWithCorrectCredentials() {
        boolean isSideMenuButtonDisplayed = loginPageService.login(user).isSideMenuButtonDisplayed();
        Assert.assertTrue(isSideMenuButtonDisplayed, "Unsuccessful login");
    }
}
