package pages;

import org.openqa.selenium.By;
import utilities.Assertions;
import utilities.MobileActions;

public class WeatherHomePage {

    By locationIcon = By.xpath("//android.widget.ImageView[@resource-id=\"com.info.weather.forecast:id/iv_location\"]");
    By navigationSettingsIcon = By.xpath("//android.widget.ImageView[@resource-id=\"com.info.weather.forecast:id/iv_bt_navigation_setting\"]");
    By itemUnitSettings = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.info.weather.forecast:id/ll_item_unit_setting\"]");
    By rainIcon = By.xpath("//android.widget.ImageView[@resource-id=\"com.info.weather.forecast:id/iv_rain_chance\"]");
    By waterDropIcon = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.info.weather.forecast:id/ll_humidity\"]");

    public void validateLocationIconExistence(){
        Assertions.assertElementExists(locationIcon);
    }

    public void clickNavigationSettingsIcon(){
        MobileActions.click(navigationSettingsIcon);
    }

    public void clickItemUnitSettings(){
        MobileActions.click(itemUnitSettings);
    }

    public void validateRainIcon(){
        Assertions.assertElementExistByIndex(rainIcon);
    }

    public void validateWaterDropIcon(){
        Assertions.assertElementExistByIndex(waterDropIcon);
    }

}
