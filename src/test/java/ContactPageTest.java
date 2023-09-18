import model.Contact;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.LoginPageService;

public class ContactPageTest extends BaseTest {

    private User user;
    private Contact contact;
    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
        contact = new Contact();
    }

    @Test(testName = "Verify successful contact creation", priority = 1)
    public void verifySuccessfulAccountCreation() {
        boolean isCreatedContactNameDisplayed = loginPageService
                .login(user)
                .openNewContactPage()
                .createContact(contact)
                .isCreatedContactNameDisplayed();
        Assert.assertTrue(isCreatedContactNameDisplayed, "Contact has not been created");
    }
}
