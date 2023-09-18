package utils;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Waiter {
    public final static int WAIT_10_SECONDS = 10;
    public final static int WAIT_15_SECONDS = 15;

    private Waiter() {
    }

    public static WebElement waitElementToBeDisplayedByLocator(By locator) {
        new WebDriverWait(DriverSingleTone.getInstance().getDriver(), Duration.ofSeconds(WAIT_10_SECONDS))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        return DriverSingleTone.getInstance().getDriver().findElement(locator);
    }

    public static WebElement waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(DriverSingleTone.getInstance().getDriver(), Duration.ofSeconds(WAIT_10_SECONDS))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public static List<WebElement> waitElementsToBeDisplayed(List<WebElement> elementsList) {
        new WebDriverWait(DriverSingleTone.getInstance().getDriver(), Duration.ofSeconds(WAIT_15_SECONDS))
                .until(ExpectedConditions.visibilityOfAllElements(elementsList));
        return elementsList;
    }
}
