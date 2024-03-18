package utilities;

import utilities.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MobileActions {

    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(30);

    public static WebElement waitForElementReadiness(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    public static WebElement waitForElementClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void click(By by) {
        try {
            waitForElementReadiness(by);

            WebElement element = waitForElementClickable(by);
            element.click();
        } catch (Exception e) {
        }
    }

    public static boolean elementExists(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            return false;
        }
        if (by != null) {
            return true;
        }
        return false;
    }

    public static boolean elementNotExists(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        } catch (Exception e) {
            return true;
        }
        if (by != null) {
            return false;
        }
        return false;
    }


    public static String getElementText(By by) {
        WebElement element = waitForElementReadiness(by);
        return element.getText();
    }

    public static boolean isElementNotVisible(By by) {
        return DriverManager.getDriver().findElements(by).size() == 0;
    }

    public static void elementIsDisplayed(By by) {
        DriverManager.getDriver().findElement(by).isDisplayed();
    }

    public static boolean elementDisplayed(By by) {
        waitForElementReadiness(by);
        return DriverManager.getDriver().findElement(by).isDisplayed();
    }

    public static boolean elementExist(By by) {
        if (waitForElementReadiness(by).isDisplayed()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean elementExistByIndex(By by) {
       int size = DriverManager.getDriver().findElements(by).size();
        for (int i =1;i<size;i++){
            waitForElementReadiness(by).isDisplayed();
            Assertions.assertElementDisplayed(DriverManager.getDriver().findElements(by).get(i));
        }
        return true;
    }

}
