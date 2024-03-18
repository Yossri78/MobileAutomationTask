package stepDefinition;


import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.DriverManager;
import java.net.MalformedURLException;

public class Hooks {

   /* @BeforeClass
    public static void setup() throws MalformedURLException {

        DriverManager.startAndroidDriver();
    }*/

    @AfterStep
    public static void takeScreenshot(Scenario scenario) {
        System.out.println("Capturing Screenshot.....");
        final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
    }

   /* @AfterClass
    public static void tearDown() {
        DriverManager.getDriver().quit();
    }*/

}
