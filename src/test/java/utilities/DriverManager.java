package utilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.testng.annotations.Test;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {

    static AndroidDriver driver;

    public static void startAndroidDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("sdk_gphone_x86");
        options.setAppPackage("com.info.weather.forecast");
        options.setAppActivity("com.info.weather.forecast.activity.SettingUnitActivity");
        options.setPlatformName("Android");
        options.setPlatformVersion("11");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.autoGrantPermissions();
        driver=(new AndroidDriver(new URL("http://127.0.0.1:4723"), options));
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

}
