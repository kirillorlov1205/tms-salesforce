import driver.DriverSingleTone;
import org.testng.annotations.AfterClass;

public class BaseTest {

    @AfterClass
    public void stopBrowser() {
        DriverSingleTone.getInstance().closeDriver();
    }
}
