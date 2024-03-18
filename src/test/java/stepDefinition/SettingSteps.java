package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SettingPage;
import pages.WeatherHomePage;

public class SettingSteps {

    SettingPage settingPageObj = new SettingPage();

    @Given("user is on weather app setting page")
    public void user_is_on_weather_app_setting_page() {
        settingPageObj.validateExistenceSettingText();
    }

    @When("user clicks on weather temperature dropdown")
    public void user_clicks_on_weather_temperature_dropdown() {
        settingPageObj.clickTemperatureDropdown();
    }

    @When("user changes the temperature {string}")
    public void user_changes_the_temperature(String tempValue) {
        settingPageObj.selectTemperatureValue(tempValue);
    }

    @When("validate updated temperature {string} changes")
    public void validate_updated_temperature_changes(String tempValue) {
        settingPageObj.validateTemperatureValue(tempValue);
    }

    @Given("user clicks on time format dropdown")
    public void user_clicks_on_time_format_dropdown() {
        settingPageObj.clickTimeFormatDropdown();
    }

    @When("user changes the time {string}")
    public void user_changes_the_time(String timeValue) {
        settingPageObj.selectTimeFormatValue(timeValue);
    }

    @Then("validate updated time format {string} changes")
    public void validate_updated_time_format_changes(String timeValue) {
        settingPageObj.validateTimeFormatValue(timeValue);
    }

    @When("user clicks done button")
    public void user_clicks_done_button() {
        settingPageObj.clickDoneButton();
    }

}