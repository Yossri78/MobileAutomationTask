package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertions {


   /* public static void assertElementDisplayed(By by) {
        Assert.assertTrue(MobileActions.elementDisplayed(by));

    }*/

    public static void assertElementNotDisplayed(By by) {
        Assert.assertFalse(MobileActions.elementNotExists(by));
    }
    public static void assertElementText(By by,String expectedText){
        Assert.assertEquals(MobileActions.getElementText((by)).replaceAll("\\s+",""),expectedText.replaceAll("\\s+",""));
    }



    public static void assertElementExists(By by) {
        Assert.assertTrue(MobileActions.elementExist(by));

    }

    public static void assertElementDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());

    }

    public static boolean assertElementExistByIndex(By by) {
        int size = DriverManager.getDriver().findElements(by).size();
        for (int i =1;i<size;i++){
            MobileActions.waitForElementReadiness(by).isDisplayed();
            Assertions.assertElementDisplayed(DriverManager.getDriver().findElements(by).get(i));
        }
        return true;
    }

}
