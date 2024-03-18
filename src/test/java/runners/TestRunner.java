package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.DriverManager;
import java.net.MalformedURLException;

@CucumberOptions(features = {"src/main/resources/"}
        , glue = {"stepDefinition"}
        , tags = "@reg"
        , plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}
)

public class TestRunner extends AbstractTestNGCucumberTests{

    @BeforeClass
    public static void setup() throws MalformedURLException {

        DriverManager.startAndroidDriver();
    }

    @AfterClass
    public static void tearDown() {
        DriverManager.getDriver().quit();
    }

}
