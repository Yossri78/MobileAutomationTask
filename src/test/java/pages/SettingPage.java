package pages;

import org.openqa.selenium.By;
import utilities.Assertions;
import utilities.MobileActions;

public class SettingPage {

    By temperatureDropdown = By.xpath("//android.widget.ImageView[@resource-id=\"com.info.weather.forecast:id/iv_temp_dropdown\"]");
    String temperatureList = "//android.widget.FrameLayout[@resource-id=\"com.info.weather.forecast:id/tooltip_contentholder\"]//*[contains(@text,'%s')]";
    By temperatureValue = By.xpath("//android.widget.TextView[@resource-id=\"com.info.weather.forecast:id/tv_temp_setting\"]");
    By timeFormatDropdown = By.xpath("//android.widget.ImageView[@resource-id=\"com.info.weather.forecast:id/iv_timeformat_dropdown\"]");
    String timeFormatList = "//android.widget.FrameLayout[@resource-id=\"com.info.weather.forecast:id/tooltip_contentholder\"]//*[contains(@text,'%s')]";
    By timeFormatValue = By.xpath("//android.widget.TextView[@resource-id=\"com.info.weather.forecast:id/tv_timeformat_setting\"]");
    By settingText = By.xpath("//android.widget.TextView[@text=\"SETTING\"]");
    By doneButton = By.xpath("//android.widget.TextView[@resource-id=\"com.info.weather.forecast:id/tv_button_done\"]");


    public void clickTemperatureDropdown(){
        MobileActions.click(temperatureDropdown);
    }

    public void selectTemperatureValue(String tempValue){
        MobileActions.click(By.xpath(String.format(temperatureList,tempValue)));
    }

    public void validateTemperatureValue(String tempValue){
        Assertions.assertElementText(temperatureValue,tempValue);
    }

    public void validateExistenceSettingText(){
        Assertions.assertElementExists(settingText);
    }

    public void clickTimeFormatDropdown(){
        MobileActions.click(timeFormatDropdown);
    }

    public void selectTimeFormatValue(String timeValue){
        MobileActions.click(By.xpath(String.format(timeFormatList,timeValue)));
    }

    public void validateTimeFormatValue(String timeValue){
        Assertions.assertElementText(timeFormatValue,timeValue);
    }

    public void clickDoneButton(){
        MobileActions.click(doneButton);
    }
}
